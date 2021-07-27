package outputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream01 {
    public static void main(String[] args) throws Exception {
        String path = "e:\\file05.dat"; //dat指数据文件
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(new Dog("Tom", 5));
        objectOutputStream.close();

    }
}
class Dog implements Serializable {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
