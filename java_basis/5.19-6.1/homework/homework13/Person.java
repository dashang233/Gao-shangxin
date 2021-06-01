package homework.homework13;

public class Person {
    private String name;
    private char gender;
    private int age;
    public String play(){
        return name + "玩";
    }
    public void show(){
        System.out.println("姓名：" + name + "\n年龄：" + age + "\n性别：" + gender);
    }
    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
