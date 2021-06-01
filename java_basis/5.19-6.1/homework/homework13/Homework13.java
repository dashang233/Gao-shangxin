package homework.homework13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
//        Student s = new Student("Tom", '男', 18, "10086");
//        s.show(); //体现封装
        Person[] arr = new Person[4];
        arr[0] = new Student("Tom", '男', 18, "10086");
        arr[1] = new Student("Tom1", '男', 19, "10087");
        arr[2] = new Teacher("Tom2", '男', 22, 1);
        arr[3] = new Teacher("Tom3", '男', 20, 2);
        Homework13 h = new Homework13();
        h.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            h.execute(arr[i]);
        }

    }
    public void sort(Person[] arr){
        Person change = null;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j].getAge() < arr[j+1].getAge()){
                    change = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = change;
                }
            }
        }
    }
    public void execute(Person p){
        if(p instanceof Teacher){ //运行类型判断
            System.out.println(((Teacher)p).teach()); //向下转型
        }else{
            System.out.println(((Student)p).study());
        }
    }
}
