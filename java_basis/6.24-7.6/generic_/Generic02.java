package generic_;


import java.util.*;

public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(); //集合中元素为Employee类型
        Employee tom = new Employee("Tom", 1000, new MyDate(5, 11, 11));
        Employee jack = new Employee("Tom", 2000, new MyDate(3, 33, 33));
        Employee mary = new Employee("Mary", 3000, new MyDate(33, 33, 33));
        employees.add(tom);
        employees.add(jack);
        employees.add(mary);

        //法1
//        Collections.sort(employees, new Comparator<Employee>() { //comparator接口内均为Employee类
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if(!(o1.getName().equals(o2.getName()))){
//                    return o1.getName().compareTo(o2.getName());
//                }else{
//                    return o1.getBirthday().compareTo(o2.getBirthday());
//                }
//            }
//        });
        //法2
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //判断o1，o2类型是否相等
                if(!(o1 instanceof Employee && o2 instanceof  Employee)){
                    System.out.println("类型错误");
                    return 0;
                }
                if(!(o1.getName().equals(o2.getName()))){
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private int salary;
    private MyDate birthday;

    public Employee(String name, int salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate m) { //传入参数类型前面已指定
        if(! (year== m.getYear())){
            return year - m.getYear();
        }
        if(! (month== m.getMonth())){
            return month-m.getMonth();
        }
        return day - m.getDay();
    }
}