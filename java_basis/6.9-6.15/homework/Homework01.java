package homework;

public class Homework01 {
    public static void main(String[] args) {
        try{
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数错误"); //识别需要手动抛出异常的情况
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("计算结果是："+cal(n1, n2));
        }catch (ArrayIndexOutOfBoundsException e){ //处理抛出的异常
            System.out.println(e.getMessage()); //输出错误信息
        }catch(NumberFormatException e){
            System.out.println("参数格式不正确");
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }
    }
    public static int cal(int n1, int n2){
        return n1/n2;
    }
}
