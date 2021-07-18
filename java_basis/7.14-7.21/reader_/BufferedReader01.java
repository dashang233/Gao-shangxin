package reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String path = "e:\\file03.txt";
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close(); //只需关闭外层流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
