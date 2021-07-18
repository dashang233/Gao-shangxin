package inputStream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void read01(){
        String filepath = "e:\\file01.txt"; //文件路径
        FileInputStream fileInputStream = null;
        int readLen  = 0; //记录read(byte[] b)方法一次读取的字节数
        byte[] buf = new byte[8]; //存放文件流读取字节的数组
        try {
            fileInputStream = new FileInputStream(filepath); //创建文件流对象，用于操作文件
            while((readLen = fileInputStream.read(buf)) != -1){ //-1表示读取完毕，其他数字表示读取的字节数
                System.out.print(new String(buf, 0, readLen)); //将字节数组转化为字符串打印
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{ //读取完后，关闭文件流，释放文件连接
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
