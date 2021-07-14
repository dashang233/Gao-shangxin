package thread_;

public class Thread03 {
    public static void main(String[] args) {
        Sell sell = new Sell(); //同一个Sell的对象
        Thread thread01 = new Thread(sell);
        Thread thread02 = new Thread(sell);
        Thread thread03 = new Thread(sell);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
class Sell implements Runnable{
    private int tickets = 100;
    private boolean loop = true;
    public synchronized void sell(){ //上锁，各线程轮流卖票
        if(tickets <= 0){
            System.out.println("售罄...");
            loop = false;
            return; //结束方法
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("窗口"+Thread.currentThread().getName()+"售出一张票，剩余"+(--tickets)+"张");
    }
    @Override
    public void run() { //锁不能上在这里否则一个线程卖完所有票
        while(loop){ //锁不能上在这里否则一个线程卖完所有票
            sell();
        }
    }
}