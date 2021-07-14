package thread_;

public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start(); //启动线程
    }
}
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {
        while(times < 10){
            System.out.println("喵喵" + (++times));
            try {
                Thread.sleep(1000); //该线程休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}