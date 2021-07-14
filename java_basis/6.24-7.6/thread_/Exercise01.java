package thread_;

public class Exercise01 {
    public static void main(String[] args) throws InterruptedException { //主线程
        Thread thread = new Thread(new Sub01());
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 5){
                thread.start(); //启动
                thread.join(); //插队
            }


        }
        System.out.println("主线程结束...");
    }
}
class Sub01 implements Runnable{
    private int count = 1;
    @Override
    public void run() {
        while(true){
            System.out.println("Hello" + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(++count >10) break;
        }
        System.out.println("子线程结束...");
    }
}