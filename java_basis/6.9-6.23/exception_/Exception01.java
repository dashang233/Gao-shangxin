package exception_;

public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
            int result = n1/n2;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("异常原因：" + e.getMessage()); //输出异常信息
        }
        System.out.println("continue...");
    }
}
