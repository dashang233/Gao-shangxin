package smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//面向过程
public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int answer = 0; //接收输入值
        String details = "------明细------"; //接收零钱明细
        double money = 0; //接收收入
        double cost = 0; //接收消费
        String note = null; //接收消费说明
        double left = 0; //接收余额
        Date date = null; //获取日期
        String exit = null; //是否退出
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //修改日期格式
        do{
            System.out.println("\n=======零钱通菜单========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请输入选项：(1-4)");
            answer = scanner.nextInt();
            switch(answer){
                case 1:
                    System.out.println(details);
                    break; // break结束switch语句
                case 2:
                    System.out.println("请输入收益金额：");
                    money = scanner.nextDouble();
                    if(money <= 0){
                        System.out.println("请输入大于0的值");
                    }else{
                        System.out.println("收益入账金额：" + money);
                        left += money;
                        //获取当前时间
                        date = new Date(); // 创建Date获取当前时间
                        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额:" + left;
                    }
                    break;
                case 3:
                    System.out.println("请输入消费金额：");
                    cost = scanner.nextDouble();
                    if(cost <= 0 || cost > left){
                        System.out.println("请输入大于0并且小于等于余额的值的值");
                    }else{
                        System.out.println("请输入消费信息");
                        note = scanner.next();
                        left -= cost;
                        date = new Date(); //获取当前时间
                        details += "\n" + note + "\t-" + cost + "\t" + sdf.format(date) + "\t余额：" + left;
                    }
                    break;
                case 4:
                    //判断输入是否正确
                    do{
                        System.out.println("确定要退出吗(y/n)");
                        exit = scanner.next();
                    }while(!(exit.equals("y") || exit.equals("n")));
                    //根据输入执行操作
                    switch(exit) {
                        case "y":
                            System.out.println("退出"); //需要设置loop，退出do-while循环
                            loop = false;
                            break;
                        case "n":
                            break;
                    }
                    break;
                default:
                    System.out.println("请按要求输入");
            }

        }while(loop);
        System.out.println("------结束了零钱通项目------");
    }
}



