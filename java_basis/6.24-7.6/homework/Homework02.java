package homework;

public class Homework02 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread thread1 = new Thread(bank);
        thread1.setName("用户A");
        Thread thread2 = new Thread(bank);
        thread2.setName("用户B");
        thread1.start();
        thread2.start();
    }
}
class Bank implements Runnable{
    private int balance = 10000;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if (balance <= 0){
                    System.out.println("余额不足，无法继续取款,"+Thread.currentThread().getName() + "线程结束");
                    break;
                }
                balance -= 1000;
                System.out.println(Thread.currentThread().getName() + "取走1000,剩余"+balance);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}