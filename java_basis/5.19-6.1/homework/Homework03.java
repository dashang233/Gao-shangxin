package homework;

public class Homework03 {
    public static void main(String[] args) {
        Professor tom = new Professor("Tom", 19);
        System.out.println(tom.introduce(tom));
    }
}
class Teacher{
    private String name;
    private int age;
    private String post;
    private  double salary;
    public Teacher() {
    }
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce(Teacher teacher){
        return teacher.getName()+"的年龄为"+teacher.getAge();
    }

}

class Professor extends Teacher{
    double salary = 1.3;
    String post = "教授";
    public Professor(){

    }
    public Professor(String name, int age){
        this();
    }

    @Override
    public String introduce(Teacher teacher) {
        return super.introduce(teacher) + ",职称为" + ((Professor)teacher).post + ",基本工资为"+((Professor)teacher).salary;
    }
}
class SubProfessor extends Teacher{
    double salary = 1.2;
    String post = "副教授";
    public SubProfessor(String name, int age){
        super(name, age);
    }
    @Override
    public String introduce(Teacher teacher) {
        return super.introduce(teacher) + ",职称为" + ((SubProfessor)teacher).post + ",基本工资为"+((SubProfessor)teacher).salary;
    }
}
class Lecture extends Teacher{
    double salary = 1.1;
    String post = "讲师";
    public Lecture(String name, int age){
        super(name, age);
    }
    @Override
    public String introduce(Teacher teacher) {
        return super.introduce(teacher) + ",职称为" + ((Lecture)teacher).post + ",基本工资为"+((Lecture)teacher).salary;
    }
}