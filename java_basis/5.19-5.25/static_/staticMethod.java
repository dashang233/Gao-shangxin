package static_;

public class staticMethod {
    public static void main(String[] args) {
//        Student tom = new Student("Tom");
//        Student jack = new Student("Jack");
//        tom.pay(100);
//        Student.pay(200);
//        jack.show();

        System.out.println(Tools.calSum(1,2));

    }
}
class Student{
    private String name;
    //静态变量，累积学生学费
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }
    //静态方法可访问静态属性
    public static void pay(double perFee){
        Student.fee += perFee;
    }
    public static void show(){
        System.out.println("总学费：" + Student.fee);
    }
}
//工具类使用静态方法
class Tools{
    public static double calSum(double n1, double n2){
        return n1 + n2;
    }
}