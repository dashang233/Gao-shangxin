package polyarr;

public class PolyArr {
    public static void main(String[] args) {
//        Person person = new Person("Tom");
//        Student student1 = new Student("1");
//        Student student2 = new Student("2");
//        Teacher teacher1 = new Teacher("3");
//        Teacher teacher2 = new Teacher("4");
//        Person[] arr = {person, student1, student2, teacher1, teacher2};
        Person[] arr = new Person[5];
        arr[0] = new Person("Tom");
        arr[1] = new Student("1");
        arr[2] = new Student("2");
        arr[3] = new Teacher("3");
        arr[4] = new Teacher("4");
//        Student student = (Student)arr[2];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] instanceof Student){
                ((Student)arr[i]).study();
            }
        }
    }
}
class Person{
    private String name = "Tom";
    int age;
    public Person(String name){
        this.name = name;
    }
    public void say(){
        System.out.println("你好");
    }

    public String getName() {
        return name;
    }
}
class Student extends Person{
    int score;
    public Student(String name){
        super(name);
    }
    public String getName(){
        return super.getName();
    }
    public void study(){
        System.out.println("学习！");
    }
}
class Teacher extends Person{
    public Teacher(String name){
        super(name);
    }
    int salary;
}