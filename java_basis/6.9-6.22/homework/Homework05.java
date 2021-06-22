package homework;

public class Homework05 {
    public static void main(String[] args) {
        count("AbbRYV89E");
    }
    public static void count(String str){
        int count1 = 0; //大写字母
        int count2 = 0; //小写字母
        int count3 = 0; //数字
        if(str == null){
            System.out.println("输入不能为空");
            return;
        }
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                count1++;
            }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                count2++;
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                count3++;
            }
        }
        System.out.println("大写字母"+count1+"个，小写字母"+count2+"个，数字"+count3+"个");
    }
}
