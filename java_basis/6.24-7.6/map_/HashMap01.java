package map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new Employee01("Tom", 30000,"1001"));
        hashMap.put(2, new Employee01("Jerry", 19000,"1002"));
        hashMap.put(3, new Employee01("Mary", 8000,"1003"));
        Set set = hashMap.keySet();
        //法1
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Employee01 employee = (Employee01)(hashMap.get(key)); //通过索引key获取value对象
            if(employee.getSalary()>18000){
                System.out.println(employee);
            }
        }
        //法2
        System.out.println("==========");
        for (Object obj : set){
            Employee01 employee = (Employee01)(hashMap.get(obj)); //通过索引key获取value对象
            if(employee.getSalary()>18000){
                System.out.println(employee);
            }
        }
    }
}
class Employee01{
    private String name;
    private int salary;
    private String id;

    public Employee01(String name, int salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee01{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}