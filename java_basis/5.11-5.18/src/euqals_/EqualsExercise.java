package euqals_;

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 18, '男');
        Person person2 = new Person("Tom", 18, '男');
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person2);

    }
}
class Person{
    private String name;
    private int age;
    private char gender;

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //重写Object的equals方法
    public boolean equals(Object obj){
        if(this == obj) { //判断对象是否相同，this指调用该方法的对象
            return true;
        }
        if(obj instanceof Person) { //判断类型是否为Person类型，类型不同则无法比较
            //先向下转型，以获得Person类的get、set方法
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    //重写toString方法
    public String toString(){
        return "name" + name + ", age" + age + ", gender" + gender; //直接调用本类的属性
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}