package homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car1 = new Car("宝马", 3000);
        Car car2 = new Car("奥迪", 2000);
        arrayList.add(car1);
        arrayList.add(car2);
        System.out.println(arrayList.contains(car1));
        System.out.println(arrayList.isEmpty());
        for(Object obj : arrayList){
//            Car car = (Car)obj;
            System.out.println(obj); //动态绑定
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
class Car{
    private String name;
    private int Price;

    public Car(String name, int price) {
        this.name = name;
        Price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }
}