package abstract_;

class Test01{
    public static void main(String[] args) {
        B b = new B();
        b.cal();
    }
}
public abstract class A {
    public abstract void job(); //抽象方法
    public void cal(){ //实现方法，调用抽象方法
        long time1 = System.currentTimeMillis();
        job(); //动态绑定机制
        long time2 = System.currentTimeMillis();
        System.out.println("用时：" + (time2-time1));
    }
}
class B extends A {
    @Override
    public void job() { //重写父类抽象方法
        int count = 0;
        for (int i = 1; i <= 100000; i++) {
            count += i;
        }
    }
}