package smallChange;

import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int answer = 0; //接收输入值
        do{
            System.out.println("=======零钱通菜单========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请输入选项：(1-4)");
            answer = scanner.nextInt();
            switch(answer){
                case 1:
                    System.out.println("显示1");
                    break;
                case 2:
                    System.out.println("显示2");
                    break;
                case 3:
                    System.out.println("显示3");
                    break;
                case 4:
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("请按要求输入");
            }

        }while(loop);
    }
}



