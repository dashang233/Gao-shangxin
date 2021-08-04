package upload_;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class S {
    public static void main(String[] args) throws Exception {
        //创建监听端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端口9999正在监听");
        //等待连接
        Socket socket = serverSocket.accept();
        //读取并写出客户端传来的数据
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = Utils.streamToByteArray(bis); //输入流转为字节数组
        String path = "f:\\flower2.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        bos.write(bytes);
        bos.close();

        //回复客户端
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片");
        bw.flush();
        socket.shutdownOutput();


        //关闭资源
        bw.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
