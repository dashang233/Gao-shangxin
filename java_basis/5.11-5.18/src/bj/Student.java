package bj;

public class Student extends People{
    private String xueli;
    private String xueyuan;

    public Student(String name, int age, char gender, String number, String home, String xueli, String xueyuan) {
        super(name, age, gender, number, home);
        this.xueli = xueli;
        this.xueyuan = xueyuan;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan;
    }

    public void havingClass(){
        System.out.println(getName() + "上课中");
    }
    public void write(Student student){
        if(student instanceof Benke){
            System.out.println(student.getName() + "正在写" + ((Benke)student).getThesis());
        }else if(student instanceof Shuoshi){
            System.out.println(student.getName() + "正在写" + ((Shuoshi)student).getThesis());
        }else{
            System.out.println(student.getName() + "正在写" + ((Boshi)student).getThesis());
        }
    }
}