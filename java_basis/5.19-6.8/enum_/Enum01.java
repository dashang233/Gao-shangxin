package enum_;

public class Enum01 {
    public static void main(String[] args) {
        System.out.println(Person.Tom);
        System.out.println(Person.Jack);
    }
}
class Person{
    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static final Person Tom = new Person("Tom",12);
    public static final Person Jack = new Person("Jack",13);

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}