package reader_;


import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
    public static void main(String[] args) {

    }
    @Test
    public void reader01(){
        String path = "e:\\file01.txt";
        FileReader fileReader = null;
        char[] buf = new char[8];
        int readLen = 0;
        try {
            fileReader = new FileReader(path);
            while((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen)); //每次循环读取长度为readLen
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }
}
