package homework;

import javax.lang.model.element.VariableElement;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Integer01 integer01 = new Integer01();
        Thread thread = new Thread(integer01);
        thread.start();
        Command command = new Command(integer01); //B线程获取A的对象
        Thread thread1 = new Thread(command);
        thread1.start();
    }
}
class Integer01 implements Runnable{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        do{
            System.out.println((int)(Math.random()*100+1)); //1-100的整数
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (loop);
    }
}
class Command implements Runnable{
    Scanner scanner = new Scanner(System.in);
    private Integer01 integer01;

    public Command(Integer01 integer01) {
        this.integer01 = integer01;
    }

    @Override
    public void run() {
        System.out.println("输入Q表示退出");
        char c = scanner.next().toUpperCase().charAt(0); //字符转为大写
        if (c == 'Q') {
            integer01.setLoop(false);
        }
    }
}