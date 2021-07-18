package outputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String srcPath = "e:\\view.jpg";
        String desPath = "e:\\view1.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            byte[] buf = new byte[1024];
            int readLen = 0;
            fileInputStream = new FileInputStream(srcPath);
            fileOutputStream = new FileOutputStream(desPath);
            while((readLen = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf,0, readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream != null){
                    fileInputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
