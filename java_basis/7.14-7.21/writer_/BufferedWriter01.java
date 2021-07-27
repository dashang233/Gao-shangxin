package writer_;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
    public static void main(String[] args) throws IOException {
        String path = "e:\\file04.txt";
        //追加在FileWriter中实现
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true));
        bufferedWriter.newLine(); //插入换行符
        bufferedWriter.write("你好，世界");
        bufferedWriter.newLine(); //插入换行符
        bufferedWriter.write("你好世界");
        bufferedWriter.close(); //关闭外层流即可
    }
}
