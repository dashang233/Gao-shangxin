package bj;

public class Benke extends Student{
    private String thesis;

    public Benke(String name, int age, char gender, String number, String home, String xueli, String xueyuan, String thesis) {
        super(name, age, gender, number, home, xueli, xueyuan);
        this.thesis = thesis;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

}
