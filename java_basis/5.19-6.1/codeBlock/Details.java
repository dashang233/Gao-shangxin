package codeBlock;

public class Details {
    public static void main(String[] args) {
        B b = new B();
//        System.out.println(B.n1); // 111 222 1
    }
}
class A{
    {
        System.out.println("111");
    }
}
class B extends A{
    public static int n1 = 1;
    static {
        System.out.println("222");
    }
    {
        System.out.println("333");
    }
}