package homework.homework13;

import sun.plugin2.message.GetNameSpaceMessage;

import javax.xml.transform.Source;

public class Student extends Person{
    private String stu_id;

    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }
    public String study(){
        return "好好学习";
    }
    public String  play(){
        return super.play() + "踢足球";
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + super.toString();
    }

    @Override
    public void show() {
        System.out.println("学生的信息：");
        super.show();
        System.out.println("学号：" + stu_id + "\n" + this.study() + "\n" + this.play());
        System.out.println("-------------");
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
