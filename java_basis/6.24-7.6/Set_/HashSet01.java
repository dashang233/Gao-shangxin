package Set_;

import java.util.HashSet;
import java.util.Objects;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("Tom", 19));
        hashSet.add(new Employee("Jack", 17));
        hashSet.add(new Employee("Tom", 19));
        System.out.println(hashSet);
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //同一对象直接返回true
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o; //向下转型
        return age == employee.age &&
                Objects.equals(name, employee.name); //年龄、姓名相同的视为同一对象
    }
    @Override
    public int hashCode() { //重写hashCode()方法，
        return Objects.hash(name, age); // 名字与年龄相同计算出的hash值即相同
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}