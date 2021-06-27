package arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort01 {
    public static void main(String[] args) {
        int[] arr = {1,7,-3,0};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
        sort1(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) { //o1, o2即传入的arr[j],arr[j+1]
                int n1 = (Integer)o1; //自动拆箱
                int n2 = (Integer)o2;
                return n2 - n1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int num;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    num = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = num;
                }
            }
        }
    }
    //冒泡结合接口实现排序
    public static void sort1(int[] arr, Comparator c){ //调用接口用于自定义排序原则
        int num;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(c.compare(arr[j], arr[j+1]) > 0){ //动态绑定
                    num = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = num;
                }
            }
        }
    }

}
