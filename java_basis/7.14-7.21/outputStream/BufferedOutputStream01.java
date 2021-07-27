package outputStream;

import java.io.*;
import java.nio.file.Path;
//二进制拷贝
public class BufferedOutputStream01 {
    public static void main(String[] args) {
        String srcPath = "e:\\view.jpg";
        String desPath = "e:\\view1.jpg";
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        byte[] b = new byte[1024]; //缓冲，提升效率
        int i = 0; //每次读取长度
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcPath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desPath));
            while((i = bufferedInputStream.read(b)) != -1){
                bufferedOutputStream.write(b,0,i); //读多书，写多少，避免错误
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedInputStream != null){
                    bufferedInputStream.close();
                }
                if(bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
