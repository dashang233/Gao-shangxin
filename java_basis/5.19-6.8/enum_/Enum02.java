package enum_;

public class Enum02 {
    public static void main(String[] args) {
        Person02 p = Person02.TOM;
        System.out.println(p.name());
        System.out.println(p.ordinal());
        Person02[] arr = Person02.values();
        for(Person02 each : arr){
            System.out.println(each);
        }
        System.out.println(Person02.valueOf("TOM"));
        System.out.println(Person02.JACK.compareTo(Person02.TOM));
    }
}
enum Person02{
    TOM("Tom",18),JACK("Jack",19);
    private String name;
    private int age;

    private Person02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}