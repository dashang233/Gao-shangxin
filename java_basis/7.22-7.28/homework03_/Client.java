package homework03_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //创建socket
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //输出文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载图片名：");
        String name = scanner.next();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(name.getBytes());
        socket.shutdownOutput(); //输出结束标记

        //读取文件
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = Utils.streamToByteArray(inputStream);
        //写出到磁盘
        String path = "f:\\flower02.jpg";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        fileOutputStream.write(bytes);
        System.out.println("成功写出到磁盘");
        //关闭资源
        fileOutputStream.close();
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
