package exercise;

import java.util.Scanner;

public class TryCatch01 {
    static int num;
    static Scanner scanner = new Scanner(System.in);
    public static int userInput(){
        try{
            System.out.println("请输入一个整数:");
            String input = scanner.next();
            num = Integer.parseInt(input);
        }catch(Exception e){ //不能转换为int就报错
            System.out.println("输入的不是整数");
            userInput();
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(userInput());
    }
}
