package reader_;

import java.io.*;

public class InputStreamReader01 {
    public static void main(String[] args) throws IOException {
        String path = "e:\\file04.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path), "gbk");
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println(s);
        br.close();


    }
}
