package outputStream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        String path = "e:\\file02.txt";
        FileOutputStream fileOutputStream = null; //不仅try语句块中需要使用文件流对象
        try {
            fileOutputStream = new FileOutputStream(path,true); //创建文件输出流,末尾追加
//            fileOutputStream.write('H'); //char自动转为int型
            String s = "hello~";
            fileOutputStream.write(s.getBytes(),0,3); //将字符串转为byte数组,从0开始写3个
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
