package extends_;

public class Student {
    public String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("姓名" + name + "，年龄" + age);
    }
}
