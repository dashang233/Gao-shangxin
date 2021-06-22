package homework;

public class Homework02 {
    public static void main(String[] args) {
        String s1 = "abcd";
        try {
            //替换常量池内原字符串
            s1 = reverse(s1,0,1); //捕捉到错误则不在继续执行try中其他代码
            System.out.println(s1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static String reverse(String str, int start, int end){
        if(!(str!=null && start>=0 && end<str.length() && start < end)){
            throw new RuntimeException("输入参数错误"); //抛出异常被捕获后面代码不再执行
        }
        char[] chars = str.toCharArray(); //将字符串转为字符数组
        char temp;
        for (int i = start, j=end; i < j; i++,j--) { //i>=j时表示交换结束
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars); //将字符数组转为字符串
    }
}
