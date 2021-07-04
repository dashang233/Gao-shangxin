package orderSystem;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;

public class OrderView {
    int key = 0;
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    public void mainMenu(){
        System.out.println("欢迎光临！");
        System.out.println("请问您是：管理员/用户？");
        String identification = scanner.next();
        if(identification.equals("管理员")){
            do{
                System.out.print("请输入管理员密码：");
                String pwd = scanner.next();
                if(pwd.equals("111")) {
                    System.out.println("登录成功！");
                    break;
                }else{
                    System.out.print("密码错误,是否继续登录(y / n)?");
                    String next = scanner.next();
                    if(next.equals("n")){
                        return;
                    }
                }
            }while(true);

            do{ //管理员操作
                System.out.println("\n==========点餐系统==========");
                System.out.println("1 修改折扣");
                System.out.println("2 查看菜品剩余供应量");
                System.out.println("3 查看未完成订单");
                System.out.println("4 查看菜品消费情况");
                System.out.println("5 查看当天订单统计信息");
                System.out.println("6 统计当天赠送的菜品详情");
                System.out.println("7 统计每天每单的等待时间（支持排序）、平均等待时间");
                System.out.println("8 退出");

                System.out.print("请输入选项(1-8)");
                key = scanner.nextInt();
                switch(key){
                    case 1:
                        listDishes();
                        changeDiscount();
                        break;
                    case 2:
                        checkLeft();
                        break;
                    case 3:
                        checkUndone();
                        break;
                    case 4:
                        checkSale();
                        break;
                    case 5:
                        orderInfo();
                        break;
                    case 6:
                        freeDish();
                        break;
                    case 7:
                        waitTime();
                        break;
                    case 8:
                        exit();
                        break;
                }
            }while(loop);
        }else{
            do{ //执行一次代表一个人点餐
                System.out.println("\n==========点餐系统==========");
                System.out.println("1 点餐");
                System.out.println("2 查看订单");
                System.out.println("3 获取近期的爆款菜品");
                System.out.println("4 退出");

                System.out.print("请输入选项(1-11)");
                key = scanner.nextInt();
                switch(key){
                    case 1:
                        listDishes();
                        addOrders();
                        break;
                    case 2:
                        findOrder();
                        break;
                    case 3:
                        popDish();
                        break;
                    case 4:
                        exit();
                        break;
                }
            }while(loop);
        }

    }
    public void listDishes(){
        System.out.println("==============主食==============");
        System.out.printf("%-12s","菜名");
        System.out.printf("%-12s","价格");
        System.out.printf("%-12s","折扣");
        System.out.printf("剩余份数"+"\n");
        Dish[] dishes = Dishes.dishes;
        for (int i = 0; i < dishes.length; i++) {
            System.out.printf("%-15s",(i+1) +" "+dishes[i].getName());
            System.out.printf("%-15s",dishes[i].getPrice());
            System.out.printf("%-15s",dishes[i].getDiscount());
            System.out.printf(dishes[i].getRemain()+"\n");
        }
    }
    public void addOrders(){
        Member member = logIn(); //接收会员信息
        ArrayList arrayList1 = new ArrayList(); //菜品序号
        ArrayList arrayList2 = new ArrayList(); //菜品数量
        do{ //接收一次点餐的各菜品及数量
            System.out.print("请输入菜品序号：");
            int n1 = scanner.nextInt();
            System.out.print("请输入菜品数量：");
            int n2 = scanner.nextInt();

            if(Dishes.dishes[n1-1].getRemain() < n2){ //下单数量需小于菜品剩余数量
                System.out.print("当前菜品售罄，请重新选择:");
                continue;
            }

            arrayList1.add(n1);
            arrayList2.add(n2);
            System.out.print("是否继续点菜(y/n):\n");
            if(scanner.next().equals("n")){
                break;
            }
        }while(true);
        OrderService.add(arrayList1, arrayList2, member);
        System.out.println(OrderService.getOrders().get(OrderService.getOrders().size()-1)); //输出本次订单信息

    }
    public void changeDiscount(){ //管理员修改折扣，一次程序运行中有效
        System.out.print("请输入打折菜品序号：");
        int index = scanner.nextInt()-1;
        System.out.print("请输入折扣：");
        double discount = scanner.nextDouble();
        Dishes.dishes[index].setDiscount(discount); //修改折扣
    }

    public Member logIn(){ //返回会员对象
        Member[] values = Member.values();
        System.out.print("\n请输入会员编号");
        String next = scanner.next();
        for (int i = 0; i < values.length; i++) {
            if(values[i].getMemberID().equals(next)){
                System.out.println("验证成功，欢迎您，尊敬的"+values[i].getLevel()+"会员！");
                return values[i];
            }
        }
        System.out.println("未查找到会员信息");
        return null;
    }

    public void findOrder(){ //查看订单、添加订单均可以更新订单完成状态
        OrderService.status();
        System.out.print("请输入查询编号：");
        int num = scanner.nextInt()-1;
        System.out.println(OrderService.getOrders().get(num));
    }

    public void checkLeft(){ //统计菜品的剩余供应量
        System.out.print("请输入查看菜品编号/名称");
        String name = scanner.next();
        int i = 1;
        for(Dish dish: Dishes.dishes){
            if(name.equals(dish.getName()) || name.equals(String.valueOf(i))) { //通过菜名或菜品编号查询
                System.out.println(dish.getName() +"剩余"+dish.getRemain() +"份");
            }
            i++;
        }
    }

    public void checkUndone(){ //查看当前时刻还没有完成的所有订单
        OrderService.status();
        Iterator iterator = OrderService.getOrders().iterator();
        while (iterator.hasNext()) {
            Order order = (Order)iterator.next();
            if(order.getOderStatus().equals("待完成")){
                System.out.println(order);
            }
        }
    }

    public void checkSale(){ //统计每个菜品的消费量和实际营收金额
        Arrays.sort(Dishes.dishes); //排序
        for(Dish dish: Dishes.dishes){
            dish.print();
        }
    }

    public void orderInfo(){ //统计每天总营收金额、订单量、平均每单的消费额、总折扣金额
        ArrayList orders = OrderService.getOrders(); //接收所有订单对象
        double revenue = 0; //记录总营收
        double discount = 0; //记录总折扣金额
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = (Order)iterator.next();
            revenue += order.getPayment();
            discount += order.getCost()-order.getPayment();
        }
        System.out.println("\n==========当天订单信息统计==========");
        System.out.println("当天总营收金额为："+revenue);
        System.out.println("当天订单量为：" + orders.size());
        System.out.println("平均每单销售额：" + (revenue/orders.size()));
        System.out.println("总折扣金额" + discount);

    }

    public void popDish(){
        Dish[] dishes = Dishes.dishes;
        Arrays.sort(dishes);
        System.out.println("\n==========爆款菜品==========");
        System.out.println("近期爆款菜品为:"+ dishes[0].getName() +", 共销售"+ dishes[0].getSales()+"份");
    }

    public void freeDish(){
        System.out.println("\n==========当天赠送菜品详情==========");
        int[] dishes = OrderService.getFreeDish();
        for (int i = 0; i < dishes.length; i++) {
            if(dishes[i] != 0){
                System.out.println(Dishes.dishes[i].getName() + "共赠送" + dishes[i] + "份");
            }
        }

    }

    public void waitTime(){
        System.out.println("\n==========当天订单等待时间统计==========");
        ArrayList orders = OrderService.getOrders(); //接收所有订单对象
        Collections.sort(orders); //自定义Order按照排队时间排序
        double totalWaitTime = 0; //记录总等待时间
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()) { //遍历集合，获取总等待时间
            Order order = (Order)iterator.next();
            System.out.println("第"+order.getOrderNum()+"个订单，共等待"+order.getWorkingTime()+"分钟");
            totalWaitTime += order.getWorkingTime();
        }
        System.out.println("订单平均等待时间为：" + totalWaitTime/orders.size());
    }

    public void exit(){
        loop = false;
        System.out.println("退出系统...");
    }

}
