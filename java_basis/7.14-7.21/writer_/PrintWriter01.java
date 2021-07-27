package writer_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter01 {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.write("你好");
        printWriter.close();
        //写入到文件
        PrintWriter printWriter1 = new PrintWriter(new FileWriter("e:\\f2.txt"));
        printWriter1.write("你好呀");
        printWriter1.close();
    }
}
