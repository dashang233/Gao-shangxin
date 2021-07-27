package homework_;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String path = "F:\\mytemp";
        File file = new File(path);
        if(file.exists()){
            System.out.println("文件夹已存在");
        }else{
            if(file.mkdir()){
                System.out.println("文件夹不存在，已完成创建");
            }else{
                System.out.println("文件夹不存在，但创建失败");
            }

        }

        String path1 = "F:\\mytemp\\hello.txt";
        File file1 = new File(path1);
        if(file1.exists()){
            System.out.println("文件已存在");
        }else{
            if(file1.createNewFile()){
                System.out.println("文件不存在，已完成创建");
            }else{
                System.out.println("文件不存在，但创建失败");
            }
        }
        FileWriter fileWriter = new FileWriter(path1);
        fileWriter.write("hello,world!");
        fileWriter.close();
    }
}
