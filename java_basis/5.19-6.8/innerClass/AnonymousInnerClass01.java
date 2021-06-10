package innerClass;

public class AnonymousInnerClass01 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.f1();

    }

}
class Outer01{
    private int n1 = 10;
    public void f1(){
        new Person(){
            @Override
            public void speak() {
                System.out.println("2");
                System.out.println(n1);
            }
        }.speak(); //动态绑定机制
    }
}
class Person{
    public void speak(){
        System.out.println("1");
    }
}