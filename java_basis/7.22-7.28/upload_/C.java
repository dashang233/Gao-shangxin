package upload_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class C {
    public static void main(String[] args) throws Exception {
        //连接服务器端口，返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //创建读取磁盘文件的输入流
        String path = "f:\\flower.jpg";
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream(path));
        byte[] bytes = Utils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close(); //为啥关闭bis
        socket.shutdownOutput();

        //接收服务端发来的消息
        InputStream inputStream = socket.getInputStream();
        String s = Utils.streamToString(inputStream);
        System.out.println(s);

        //关闭资源
        bos.close();
        inputStream.close();
        socket.close();

    }
}
