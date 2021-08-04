package upload_;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        //创建监听端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器端口8888正在监听");
        //等待连接
        Socket socket = serverSocket.accept();
        //读取并写出客户端传来的数据
        String path = "f:\\flower2.jpg";
        InputStream inputStream = socket.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        int readLen = 0;
        byte[] buf = new byte[1024];
        while((readLen = inputStream.read(buf)) != -1){
            fileOutputStream.write(buf, 0, readLen);
        }
        fileOutputStream.close();

        //回复客户端
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片");
        bw.flush();
        socket.shutdownOutput();


        //关闭资源
        bw.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
