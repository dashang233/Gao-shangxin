package polyparameter;

public class Test {
    public void show(Employee e){
        System.out.println(e.getAnnual());
    }
    public void test(Employee e){
        if(e instanceof Worker){
            ((Worker)e).work();
        }else{
            ((Manager)e).manage();
        }
    }
    public static void main(String[] args) {
        Manager m = new Manager("Tom", 10000, 20000);
        Test t= new Test();
        t.show(m);
        t.test(m);
        "1".equals("2");
    }
}
class Employee{
    private String name;
    private double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual(){
        return salary * 12;
    }
}

class Worker extends Employee{
    public Worker(String name, double salary){
        super(name, salary);
    }
    public void work(){
        System.out.println(getName() + "工作中...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println(getName()+"管理中...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}