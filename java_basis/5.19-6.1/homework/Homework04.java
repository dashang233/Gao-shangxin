package homework;

import javafx.concurrent.Worker;

public class Homework04 {
    public static void main(String[] args) {
        Manager tom = new Manager("Tom", 500, 108,1.2, 1000);
        tom.show();
    }
}
class Employee{
    private String name;
    private double pay;
    private int days;
    private double level; //工资等级

    public Employee(String name, double pay, int days, double level) {
        this.name = name;
        this.pay = pay;
        this.days = days;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public void show(){
        System.out.println("工资为：");
    }
}
class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double pay, int days, double level, double bonus) {
        super(name, pay, days, level);
        this.bonus = bonus;
    }

    @Override
    public void show() {
        //属性在父类故需通过get方法获取,父类私有属性不可直接调用
        System.out.println(this.getName() + "工资为：" + (bonus+this.getPay()*this.getDays()*this.getLevel()));
    }
}
//class Worker extends Employee{
//
//}