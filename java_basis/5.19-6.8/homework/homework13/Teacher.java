package homework.homework13;

public class Teacher extends Person{
    private int work_age;
    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }
    public String  teach(){
        return "认真教学";
    }
    public String play(){
        return super.play() + "象棋";
    }

    @Override
    public void show() {
        System.out.println("老师的信息：");
        super.show();
        System.out.println("工龄：" + work_age + "\n" + this.teach() + "\n" + this.play());
        System.out.println("-------------");
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age + super.toString();
    }
}
