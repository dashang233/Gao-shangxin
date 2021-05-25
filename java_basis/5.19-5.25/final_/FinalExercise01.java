package final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area(2);
    }
}
class Circle{
//    private static final double pi = 3.14;
    private final double pi;
//    static {
//        pi = 3.14;
//    }
    public Circle(){
        pi = 3.14;
    }
    public void area(double r){
        System.out.println("面积是：" + pi * r * r);
    }
}
