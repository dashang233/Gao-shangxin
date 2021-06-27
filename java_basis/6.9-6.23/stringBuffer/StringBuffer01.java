package stringBuffer;

public class StringBuffer01 {
    public static void main(String[] args) {
        String s1 = "hello";
        StringBuffer sb1 = new StringBuffer(s1);
        StringBuffer sb2 = new StringBuffer();
        sb2 = sb2.append(s1);
        System.out.println(sb2);
        String s2 = sb1.toString();
        String s3 = new String(sb2);

        StringBuffer sb3 = new StringBuffer("12345");
        StringBuffer replace = sb3.replace(2, 4, "9");
        System.out.println(replace);
    }
}
