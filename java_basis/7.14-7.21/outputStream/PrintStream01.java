package outputStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream01 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "e:\\f1.txt";
        PrintStream out = System.out;
        out.print("你好");
        out.close();
        System.setOut(new PrintStream("e:\\f1.txt"));
        System.out.println("你好呀");
    }
}
