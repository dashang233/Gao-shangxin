package wrapper;

public class Integer01 {
    public static void main(String[] args) {
        int n1 = 1;
//        Integer integer = new Integer(n1);
        Integer integer = Integer.valueOf(n1);
        int n2 = integer.intValue();

        //Integer 转 String
        Integer n3 = 100;
        String s1 = n3 +"";
        String s2 = n3.toString();
        String s3 = String.valueOf(n3);
        //String 转 Integer
        String s4 = "1234";
        Integer n4 = new Integer(s4);
        Integer n5 = Integer.valueOf(s4);
        Integer n6 = Integer.parseInt(s4);


    }
}
