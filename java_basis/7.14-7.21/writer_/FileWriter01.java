package writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        String path = "e:\\file03.txt";
        FileWriter fileWriter = null;
        char[] c = {'a','b','c'};
        try {
            fileWriter = new FileWriter(path, true); //向后添加
            fileWriter.write('H'); //字符
            fileWriter.write(c,0,2); //字符数组
            fileWriter.write("你好"); //字符串
            fileWriter.write("今天晴天",0,2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
