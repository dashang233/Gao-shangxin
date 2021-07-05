package generic_;

import java.util.HashMap;
import java.util.Set;

public class Generic01 {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Tom");
        Student s2 = new Student("Jack");
        Student s3 = new Student("Mary");
        students.put("p1",s1);
        students.put("p2",s2);
        students.put("p3",s3);

        Set<String> strings = students.keySet();
        for (String o : strings) {
            System.out.println(o + "-" + students.get(o));
        }

    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
}