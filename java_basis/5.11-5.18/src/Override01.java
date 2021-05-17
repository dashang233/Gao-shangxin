public class Override01 {
    public static void main(String[] args) {
        Person person = new Person("Tom", 18);
        System.out.println(person.say());
        Student jerry = new Student("Jerry", 20, "1008611", 99.8);
        System.out.println(jerry.say());
    }
}
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String say(){
        return "我是" + name + "，今年" + age + "岁~";
    }
}
class Student extends Person{
    private String id;
    private double score;
    public Student(String name, int age, String id, double score){
        super(name, age); //调用父类构造器，写在第一行
        this.id = id;
        this.score = score;
    }
    public String say(){
        return super.say() + "我的学号为：" + id + "，成绩为" + score + "分~";
    }
}