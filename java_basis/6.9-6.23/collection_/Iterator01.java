package collection_;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); //ArrayList类具有iterator()方法
        arrayList.add(new Person("Tom", 18));
        arrayList.add(new Person("Jack", 19));
        arrayList.add(new Person("Mary", 20));
        Iterator iterator = arrayList.iterator(); //调用iterator()方法返回iterator迭代器（对象）
//        while(iterator.hasNext()){
//            Object next = iterator.next();
//            System.out.println(next); //调用Person类的toString方法
//        }
//        System.out.println("");
//        iterator = arrayList.iterator();
//        System.out.println(iterator.next());

//        增强for循环实现遍历,不能使用普通for循环(非数组)
        for(Object o : arrayList) {
            System.out.println(o);
        }
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}