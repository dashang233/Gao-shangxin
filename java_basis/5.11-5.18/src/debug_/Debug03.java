package debug_;

//debug演示对象创建过程
public class Debug03 {
    public static void main(String[] args) {
        Persoon person = new Persoon("Jack", 20);
        System.out.println(person);
    }
}
class Persoon{
    private String name;
    private int age;

    public Persoon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}