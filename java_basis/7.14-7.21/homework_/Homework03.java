package homework_;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\dog.properties"));
        String name = properties.getProperty("name");
        int age = Integer.valueOf(properties.getProperty("age"));
        String color = properties.getProperty("color");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        //序列化创建的Dog对象
        String path = "f:\\dao.dat";
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(path));
        os.writeObject(dog);
        os.close();
    }
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String path = "f:\\dao.dat";
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream(path));
        Dog o = (Dog)oi.readObject();
        System.out.println(o);
        oi.close();
    }
}
class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
