package homework;

public class Homework04 {
    public static void main(String[] args) {
        change("GAo shang Xin");
    }
    public static void change(String str){
        if(str == null){
            System.out.println("输入不能为空");
            return;
        }
        String[] s = str.split(" ");
        if(s.length != 3){
            System.out.println("输入格式错误");
            return;
        }
        String s1 = String.format("%s,%s .%c",s[2],s[0],s[1].toUpperCase().charAt(0));
        System.out.println(s1);
    }
}
