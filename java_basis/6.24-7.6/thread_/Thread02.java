package thread_;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start(); //底层使用了静态代理模式实现
    }
}
class Dog implements Runnable{ //开发现场方法2
    int count = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("hi" + (++count)+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count >100){
                break;
            }
        }
    }
}