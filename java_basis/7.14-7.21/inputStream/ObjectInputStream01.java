package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "e:file05.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Object obj = objectInputStream.readObject();
        System.out.println(obj);
    }
}
