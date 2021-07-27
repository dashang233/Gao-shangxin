package homework_;

import java.io.*;
import java.util.stream.Stream;

public class Homework02 {
    public static void main(String[] args) throws IOException {
        String path = "f:\\mytemp\\hello.txt";
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        //转换流解决乱码问题
        InputStreamReader ir = new InputStreamReader(new FileInputStream(path), "gbk");
        BufferedReader br = new BufferedReader(ir);
        String line = "";
        int i = 0;
        while((line = br.readLine()) != null){
            System.out.println(++i + " " + line);
        }
        br.close();
    }
}
