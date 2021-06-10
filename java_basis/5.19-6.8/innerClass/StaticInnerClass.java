package innerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
//        Outer03.Inner inner = new Outer03.Inner(); //通过类名调用
//        inner.show();

//        Outer03 outer03 = new Outer03();
//        Outer03.Inner inner = outer03.get(); //通过创建外部类对象并调用其方法生成静态内部类对象
//        inner.show();
        Outer03.get().show();
    }
}
class Outer03{
    private static int n1 = 1;
    static class Inner{
        private static int n1 = 2;
        public static void show(){
            System.out.println("静态内部类");
            System.out.println(Outer03.n1);
        }
    }
    public static Inner get(){
        return new Inner();
    } //静态方法调用静态对象
}