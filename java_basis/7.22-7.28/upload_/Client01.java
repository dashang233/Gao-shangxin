package upload_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
    public static void main(String[] args) throws IOException {
        //连接服务器端口，返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //创建读取磁盘文件的输入流
        String path = "f:\\flower.jpg";
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream(path));
        //创建写入网络通道的输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        //边读边写
        int readLen = 0;
        byte[] buf = new byte[1024];
        while((readLen = bis.read(buf)) != -1){
            bos.write(buf, 0, readLen);
        }
        bis.close(); //输入流不再用就关闭
//        socket.shutdownOutput(); //使用while就不用不用数据结束标记


        //接收服务端发来的消息
        InputStream inputStream = socket.getInputStream();
        int readLen1 = 0;
        byte[] buf1 = new byte[1024];
        while((readLen1 = inputStream.read(buf1)) != -1){
            System.out.println(new String(buf1, 0, readLen1));
        }
        //关闭资源
        bos.close();
        inputStream.close();
        socket.close();

    }
}
