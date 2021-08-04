package homework03_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //开启端口9999监听
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("监听中...");
        //与客户端建立连接
        Socket socket = serverSocket.accept();
        //接收客户端传来的文件名
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        String s = "";
        while((readLen = inputStream.read(buf)) != -1){
            s += new String(buf, 0, readLen);
        }
        System.out.println("客户想要下载的文件名为：" + s);
        //服务端读取文件
        String s1 = "";
        if("flower".equals(s)){
            s1 = "f:\\flower.jpg";
        }else{
            s1 = "f:\\sea.jpg";
        }
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(s1));
        byte[] bytes = Utils.streamToByteArray(bis);
        //文件写出到通道中
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(bytes);
        socket.shutdownOutput(); //输出结束标记

        //关闭资源
        outputStream.close();
        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器退出...");
    }
}
