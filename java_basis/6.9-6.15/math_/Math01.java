package math_;

import java.util.Arrays;

public class Math01 {
    public static void main(String[] args) {
//        double n1 = Math.ceil(-1.9);
//        System.out.println(n1);
        int n1 = (int)(Math.random()*6+2);
        System.out.println(n1);
        Integer[] i = {1,2,3,4,5};
        System.out.println(Arrays.toString(i));
        change(n);
        change1(s);
        System.out.println(n);
        System.out.println(s);
    }
    static int n = 1;
    public static void change(int n){
        n = 2;
    }
    static String s = "Tom";
    public static  void change1(String s){
        s = "Jack";
    }

}
