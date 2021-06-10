package homework.homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker(300, 30);
        worker.show();
        Teacher teacher = new Teacher(150, 30, 1000, 10);
        teacher.show();
    }
}
class Employee{
    private String job;
    private double salary;
    private int days;

    public Employee(double salary, int days) {
        this.salary = salary;
        this.days = days;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void show(){
        System.out.println("工资为：" + salary*days);
    }
}
class Worker extends Employee{
    private String job = "工人";

    public Worker(double salary, int days) {
        super(salary, days);
    }

    @Override
    public void show() {
        System.out.print(job + "的");
        super.show();
    }
}
class Teacher extends Employee{
    private double classSal;
    private int classDays;
    private String job = "教师";

    public Teacher(double salary, int days, double classSal, int classDays) {
        super(salary, days);
        this.classSal = classSal;
        this.classDays = classDays;
    }

    @Override
    public void show() {
        System.out.println(job + "的工资为: " + (getSalary()*getDays()+classDays*classSal));
    }
}