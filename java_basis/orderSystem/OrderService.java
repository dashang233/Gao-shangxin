package orderSystem;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
    private static ArrayList orders = new ArrayList(); //保存订单对象
    public static ArrayList getOrders() {
        return orders;
    }
    private static int[] freeDish = new int[12];  //获取12道免费菜品信息
    public static int[] getFreeDish() {
        return freeDish;
    }
    public static void add(ArrayList a1, ArrayList a2, Member member){ //一个人的订单调用一次方法，多个菜品同时下单
        StringBuffer stringBuffer = new StringBuffer(); //菜品详情
        int workingTime = 0; //保存所有菜品制作时间
        double cost = 0;  //总金额
        double payment = 0; //实际金额
        StringBuffer discountInfo = new StringBuffer(); //折扣信息
        double memberDiscount = 1;  //默认非会员的折扣
        //创建一个订单对象，并输入对应会员信息
        orderSystem.Order order = new orderSystem.Order();
        if(member == null){ //处理会员订单
            order.setMemberID("非会员");
        }else{
            memberDiscount = member.getDiscount();
            order.setMemberID("会员编号："+member.getMemberID()+"，会员等级"+member.getLevel()+"，会员折扣"+member.getDiscount());
        }
        for (int i = 0; i < a1.size(); i++) { //获取一个订单中的信息
            int index = (int) a1.get(i) - 1;   //菜品序号对应dishes序号
            int dishNum = (int) a2.get(i);   //菜品数量
            orderSystem.Dishes.dishes[index].setRemain(orderSystem.Dishes.dishes[index].getRemain() - dishNum); //修改剩余份数
            stringBuffer.append(orderSystem.Dishes.dishes[index].getName()+ dishNum + "份\t");
            cost += dishNum * orderSystem.Dishes.dishes[index].getPrice(); //总金额

            double dishIncome = (dishNum * orderSystem.Dishes.dishes[index].getPrice() * orderSystem.Dishes.dishes[index].getDiscount()) * memberDiscount;
            payment += dishIncome; //实际金额,按照菜品折扣计算
            orderSystem.Dishes.dishes[index].setIncome(orderSystem.Dishes.dishes[index].getIncome() + dishIncome);//更新对应菜品的收益
            if (orderSystem.Dishes.dishes[index].getDiscount() != 1) {
                discountInfo.append(orderSystem.Dishes.dishes[index].getName() + "：" + orderSystem.Dishes.dishes[index].getDiscount() * 10 + "折");
            }
            workingTime += 10 * dishNum; //菜品计算时间,每道菜10s
        }
        if(cost > 100){ //判断一个订单所有菜品金额是否超过100
            int num = (int)(Math.random()*9+3); //每单随机生成[3,11]的整数，作为菜品索引
            stringBuffer.append("金额满100，赠送"+ orderSystem.Dishes.dishes[num].getName() +"一份");
            freeDish[num]++; //所有订单中，随机赠的菜品数量加1
        }

        //设置一个订单的各属性
        order.setDish(stringBuffer);
        order.setFinishTime(workingTime);
        order.setCost(cost);
        order.setPayment(payment);
        order.setDiscountInfo(discountInfo.toString().equals("") ? "无折扣" : discountInfo.toString());
        order.setWorkingTime(workingTime);
        orders.add(order);
        status(); //顺便更改新添加的订单的排队号
    }
    public static void status(){ //添加订单、查询订单均调用此方法实现自动更新状态
        ArrayList toBeFinish = new ArrayList(); //保存未完成的订单
        for (Object order : orders){
            if (!((orderSystem.Order) order).getOderStatus().equals("待完成")){//不是待完成，就下一个
                continue;
            }
            if (LocalDateTime.parse(((orderSystem.Order) order).getFinishTime(),((orderSystem.Order) order).dtf).isAfter(LocalDateTime.now())){//待完成的，还未完成，就下一个
                toBeFinish.add(order);
                continue;
            }
            ((orderSystem.Order) order).setOderStatus("已完成");
            ((orderSystem.Order) order).setQueueNum(0);
        }
        int i = 0;
        for (Object order : toBeFinish){ //改变待完成订单排队序号
            ((orderSystem.Order) order).setQueueNum(++i);
        }
    }
}



