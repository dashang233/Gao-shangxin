public class Student extends Person{
    private String xueli;
    private String xueyuan;

    public Student(String name, int age, char gender, String xueli, String xueyuan) {
        super(name, age, gender);
        this.xueli = xueli;
        this.xueyuan = xueyuan;
    }

    public void takeClass(){
        System.out.println("上课");
    }
}
