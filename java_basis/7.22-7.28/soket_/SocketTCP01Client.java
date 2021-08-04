package soket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //连接服务器的端口，返回Socket
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //获得和socket对象关联的字节输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //采用字符输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello, server");
        bufferedWriter.newLine(); //表示已经说完
        bufferedWriter.flush(); //手动刷新


//        outputStream.write("你好，hello, server".getBytes());
//        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf, 0, readLen));
        }

        //关闭流对象和socket
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
