package exercise;

public class Exercise04 {
    public static void main(String[] args) {
        A a = new A();
        a.work();
    }
}
class A{
    private String name = "Tom";
    public void work(){
        class B{
            private final String NAME = "Jack";
            public void show(){
                System.out.println(this.NAME);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}