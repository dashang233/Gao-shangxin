import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        //03
//        Book b = new Book("飘", 151.9);
//        System.out.println("书的价格是" + b.updatePrice());

        //04
//        A03 a03 = new A03();
//        int[] arr = {1,2,3};
//        int[] arr1 = a03.copyArr(arr);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.print(arr1.hashCode() == arr.hashCode());

        //05
//        Circle circle = new Circle(10);
//        circle.perimeter();
//        circle.area();

        //06
//        Cale c = new Cale(1.1, 2.2);
//        Double d1 = c.chu();
//        if(d1 != null){
//            System.out.println(c.chu());
//        }
        //07
//        Dog dog = new Dog("Tom", "white", 6);
//        dog.show();

        //09
//        Music u = new Music("u", 3.15);
//        System.out.println(u.getInfo());
        //12
//        Employee employee = new Employee("张三", '男', 18, "项目经理", 300000);
        //13
//        PassObject p = new PassObject();
//        Circle01 c01 = new Circle01();
//        p.printAreas(c01,5.5);
        //14
        Tom tom = new Tom();
        tom.mora();
    }
}

//03 更改价格
class Book {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double updatePrice() {
        if (price > 150) {
            price = 150;
        } else if (price > 100) {
            price = 100;
        }
        return price;
    }
}
//04 复制数组
class A03{
    public int[] copyArr(int[] arr1){
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        return arr2;
    }
}
//05求圆周长、面积
class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public void perimeter(){
        System.out.println("周长为：" + Math.PI*2*radius);
    }
    public void area(){
        System.out.println("面积为：" + Math.PI * Math.pow(radius, 2));
    }
}

//06 加减乘除
class Cale{
    double num1;
    double num2;

    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double jia(){
        return num1 + num2;
    }
    public double jian(){
        return num1 - num2;
    }
    public double cheng(){
        return num1 * num2;
    }
    public Double chu(){
        if(num2 != 0){
            return num1 / num2;
        }else{
            System.out.println("除数不能为0 ");
            return null;
        }

    }
}

//07 this初始化属性
class Dog{
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show(){
        System.out.println(name + "的颜色为" + color + "，年龄为" + age);
    }
}
//09
class Music{
    String  name;
    Double times;

    public Music(String name, Double times) {
        this.name = name;
        this.times = times;
    }

    public void play(){
        System.out.println("播放中");
    }
    public String getInfo(){
        return "歌曲名称为" + name + "，时常为" + times + "分钟";
    }
}

//12 复用构造器
class Employee{
    String name;
    char gender;
    int age;
    String position;
    double salary;
    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }
    public Employee(String name1, char gender1, int age1,String position1, double salary1){
        this(name1, gender1, age1); //调用第一个构造器
        this.position = position1;
        this.salary = salary1;
    }
}
//13 对象作为参数传递给方法
class Circle01{
    double radius;
    public double printArea(double radius){
        this.radius = radius;
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
class PassObject{
    public void printAreas(Circle01 c, double times){
        System.out.println("Radius"+"\t"+"Area");
        for (double i = 1; i <= (int)times; i++) {
            System.out.println(i + "\t" + c.printArea(i));
        }

    }
}

//14 电脑猜拳
class Tom{
    int n;
    int count;
//    public void setTom(){
//        this.n = (int)(Math.random() * 3);
//    }
    Scanner scanner = new Scanner(System.in);
    public void mora(){
        Computer computer = new Computer();
        for (int i = 0; i < 3; i++) {
            //Tom出拳
            System.out.println("请输入（0, 1, 2）");
            n = scanner.nextInt();
            //电脑出拳
            computer.setComputer();
            if((n == 0 && computer.m == 1) || (n == 1 && computer.m == 2) || n == 2 && computer.m == 0){
                System.out.print("赢了\t");
                count++;
            }else{
                System.out.print("没赢\t");
            }
        }
        System.out.println("您共赢了"+count+"次");
    }
}
class Computer{
    int m;
    public void setComputer(){
        this.m= (int)(Math.random() * 3);
    }
}



