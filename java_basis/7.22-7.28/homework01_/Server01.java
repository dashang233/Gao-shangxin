package homework01_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
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
        String s1 = bufferedReader.readLine();
        String s2 = "";
        if("name".equals(s1)){
            s2 = "你好";
        }else{
            s2 = "再见";
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(s2.getBytes());
        socket.shutdownOutput();

        inputStream.close();
        socket.close();
        serverSocket.close();
        outputStream.close();
    }
}
