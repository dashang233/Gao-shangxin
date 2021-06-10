package innerClass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.print1();

        Outer02.Inner inner01 = outer02.getInstance();
        inner01.print();
    }
}
class Outer02{
    private int n = 1;
    class Inner{
        public void print(){
            System.out.println(n);
        }
    }
    public void print1(){
        Inner inner = new Inner();
        inner.print();
    }
    public Inner getInstance(){
        return new Inner();
    }
}
