package homework;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Homework01 {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Person("Tom", 21, "经理");
        arr[1] = new Person("Jack", 19, "销售");
        arr[2] = new Person("Mary", 20, "人事");
        arr[0].bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void bubbleSort(Person[] arr){
        Person change = null;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1].age < arr[j].age){
                    change = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = change;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
