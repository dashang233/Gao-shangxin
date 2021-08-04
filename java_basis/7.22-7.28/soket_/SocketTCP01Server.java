package soket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //创建接口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("正在监听");
        //获得Socket
        Socket socket = serverSocket.accept();
        System.out.println("连接成功"+socket.getClass());
        //采用字符流
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(bufferedReader.readLine());

//        byte[] bytes = new byte[1024];
//        int readLen = 0;
//        while((readLen = inputStream.read(bytes)) != -1){
//            System.out.println(new String(bytes, 0, readLen));
//        }
//
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, client".getBytes());
        socket.shutdownOutput();

        inputStream.close();
        socket.close();
        serverSocket.close();
        outputStream.close();
    }
}
