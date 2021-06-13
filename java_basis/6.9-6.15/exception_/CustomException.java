package exception_;

public class CustomException {
    public static void main(String[] args) {
        int age = 1;
        if(!(age >= 18 && age <= 120)){
            throw new AgeException("输入年龄错误"); //创建并抛出自定义异常类的对象，并没有处理
        }
        System.out.println("输入年龄正确");
    }
}
//自定义运行时异常
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message); //message一直传入到Throwable中
    }
}