package file_;

import org.junit.Test;

import java.io.File;
import java.io.File;
import java.io.IOException;

public class FileCreat {
    public static void main(String[] args) throws IOException {


    }
    @Test
    public void creatFile() throws IOException {
        String path = "e:\\file01.txt";
        File file = new File(path); //在内存中创建了对象，还未创建文件
        file.createNewFile(); //创建文件到磁盘上
    }
}

