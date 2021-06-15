package string;

public class String01 {
    public static void main(String[] args) {
        String s1 = "1234567";
        int index = s1.indexOf('3');
        System.out.println(index);
        String s2 = s1.substring(2);
        System.out.println(s2);
        System.out.println("hello".concat("你好"));
        String s3 = "a\\b\\c";
        String[] s4 = s3.split("\\\\");
        System.out.println(s4.length);
        System.out.println(s3.length());
        System.out.println(s3);

        String s5 = "acc";
        String s6 = "abcd";
        System.out.println(s5.compareTo(s6));

        String s7 = "我叫%s,你叫%s";
        System.out.println(String.format(s7,"Tom", "Jack"));
    }
}
