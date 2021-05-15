/**
 * author dashang
 * date 2021/5/14 - 23:32
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        Person01 p1= new Person01("Tommmmmmm");
        System.out.println(p1.name);
    }

}

class Person01{
    public String name;
    private int age;
    private double salary;

    public Person01(String name){
        setName(name);
    }
    public void setName(String name){
        if(name.length()>=2 &&  name.length()<=6) {
            this.name = name;
        }else{
            System.out.println("字符串过长");

        }
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age>=1 && age <= 120){
            this.age = age;
        }
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
