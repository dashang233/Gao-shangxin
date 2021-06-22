package orderSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
    private static ArrayList orders = new ArrayList(); //保存订单对象
    Member[] values = Member.values(); //获取会员信息
    public static ArrayList getOrders() {
        return orders;
    }

    public static void add(ArrayList a1, ArrayList a2, Member member){ //多个菜品同时下单
        StringBuffer stringBuffer = new StringBuffer(); //菜品详情
        int workingTime = 0;
        double cost = 0;  //总金额
        double payment = 0; //实际金额
        StringBuffer discountInfo = new StringBuffer(); //折扣信息
        double memberDiscount = 1;                      //默认非会员的折扣
        //创建一个订单对象，并输入对应会员信息
        Order order = new Order();
        if(member == null){ //处理会员订单
            order.setMemberID("非会员");
        }else{
            memberDiscount = member.getDiscount();
            order.setMemberID("会员编号："+member.getMemberID()+"，会员等级"+member.getLevel()+"，会员折扣"+member.getDiscount());
        }
        for (int i = 0; i < a1.size(); i++) { //获取一个订单中的信息
            int index = (int) a1.get(i) - 1;   //菜品序号对应dishes序号
            int dishNum = (int) a2.get(i);   //菜品数量
            Dishes.dishes[index].setRemain(Dishes.dishes[index].getRemain() - dishNum); //修改剩余份数
            stringBuffer.append(Dishes.dishes[index].getName()+ dishNum + "份\t");
            cost += dishNum * Dishes.dishes[index].getPrice(); //总金额
            if(cost > 100){
                stringBuffer.append("金额满100，赠送菜品一份");
            }
            double dishIncome = (dishNum * Dishes.dishes[index].getPrice() * Dishes.dishes[index].getDiscount()) * memberDiscount;
            payment += dishIncome; //实际金额,按照菜品折扣计算
            Dishes.dishes[index].setIncome(Dishes.dishes[index].getIncome() + dishIncome);//更新对应菜品的价格
            if (Dishes.dishes[index].getDiscount() != 1) {
                discountInfo.append(Dishes.dishes[index].getName() + "：" + Dishes.dishes[index].getDiscount() * 10 + "折");
            }
            workingTime += 10 * dishNum;
        }

        order.setDish(stringBuffer);
        order.setFinishTime(workingTime);
        order.setCost(cost);
        order.setPayment(payment);
        order.setDiscountInfo(discountInfo.toString().equals("") ? "无折扣" : discountInfo.toString());

        orders.add(order);
        status(); //顺便更改新添加的订单的排队号
    }
    public static void status(){
        ArrayList toBeFinish = new ArrayList();
        for (Object order : orders){
            if (!((Order) order).getOderStatus().equals("待完成")){//不是待完成，就下一个
                continue;
            }
            if (LocalDateTime.parse(((Order) order).getFinishTime(),((Order) order).dtf).isAfter(LocalDateTime.now())){//待完成的，还未完成，就下一个
                toBeFinish.add(order);
                continue;
            }
            ((Order) order).setOderStatus("已完成");
            ((Order) order).setQueueNum(0);
        }
        int i = 0;
        for (Object order : toBeFinish){ //改变待完成订单排队序号
            ((Order) order).setQueueNum(++i);
        }
    }
}



