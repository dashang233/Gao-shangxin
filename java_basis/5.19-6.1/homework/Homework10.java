package homework;

import javax.print.Doc;

public class Homework10 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Tom", 19, "医生", '男', 6000);
        Doctor d2 = new Doctor("To", 19, "护士", '男', 6000);
        System.out.println(d1.equals(d2));
    }
}
class Doctor{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public boolean equals(Object obj){
        //先判断是否为同一对象
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Doctor)){ //判断是否为Doctor类或其子类
            return false;
        }
        return this.name.equals(((Doctor)obj).name) ||this.age != ((Doctor)obj).age;
    }
    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}