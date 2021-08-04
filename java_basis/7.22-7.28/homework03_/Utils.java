package homework03_;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {
    //输入流转字节数组
    public static byte[] streamToByteArray(InputStream is) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();//创建输出流对象
        byte[] b = new byte[1024];//字节数组
        int len;
        while ((len = is.read(b)) != -1) {//循环读取
            bos.write(b, 0, len);//把读取到的数据，写入bos
        }
        byte[] array = bos.toByteArray();//然后将bos转成字节数组
        bos.close();
        return array;
    }
    //输入流转字符串
    public static String streamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line + "\r\n");
        }
        return builder.toString();
    }
}