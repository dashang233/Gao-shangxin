package innerClass;

public class InnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();
    }
}

class Outer{
    private int n = 100;
    public void m1(){
        class Inner{
            private int n = 1;
            public void m2(){
                System.out.println(Outer.this.n);
            }
        }
        Inner inner = new Inner();
        inner.m2();
    }
}