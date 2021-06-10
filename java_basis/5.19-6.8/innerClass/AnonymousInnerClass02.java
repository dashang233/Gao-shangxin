package innerClass;

public class AnonymousInnerClass02 {
    public static void main(String[] args) {
        //传入形参为匿名内部类
        f1(new AA(){
            @Override
            public void show() {
                System.out.println("hi~");
            }
        });
    }
    //静态方法形参为接口类型
    public static void f1(AA aa){
        aa.show();
    }
}
interface AA{
    public void show();

}