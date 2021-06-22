package orderSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order{ //生产订单对象
    private static int orderCount; //记录订单更新数量
    private int orderNum; //订单编号
    private int queueNum; //排队序号，在OrderService的status()方法中更新
    private StringBuffer dish; //订单信息
    final LocalDateTime NOW = LocalDateTime.now(); //记录下单时间
    private String startTime;
    private String orderStatus; //订单状态信息
    private String finishTime; //订单完成时间
    private double cost; //订单总金额
    private String discountInfo; //折扣信息
    private double payment; //实付款
    private String memberID; //会员编号

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Order() {
        this.orderNum = ++orderCount;
        this.orderStatus = "待完成";
        this.startTime = dtf.format(NOW);
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getQueueNum() {
        return queueNum;
    }

    public void setQueueNum(int queueNum) {
        this.queueNum = queueNum;
    }

    public StringBuffer getDish() {
        return dish;
    }

    public void setDish(StringBuffer dish) {
        this.dish = dish;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getOderStatus() {
        return orderStatus;
    }

    public void setOderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int workingTime) {
        this.finishTime = dtf.format(NOW.plusSeconds(workingTime)); //每道菜用10s
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discount) {
        this.discountInfo = discount;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    @Override
    public String toString() {
        return "订单编号: " + orderNum
                +"\n排队序号：" + queueNum
                +"\n菜品详情：" + dish
                +"\n订单生成时间：" + startTime
                +"\n订单状态：" + orderStatus
                +"\n订单完成时间" + finishTime
                +"\n订单总金额：" + cost
                +"\n菜品折扣信息：" + discountInfo
                +"\n实付款：" + payment
                +"\n会员信息：" + memberID;
    }


}
