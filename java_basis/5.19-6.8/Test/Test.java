package Test;

public class Test {
    public static void main(String[] args) {
        Daoxu daoxu = new Daoxu();
        daoxu.show(1001);
    }
}
class Daoxu{
    public void show(int num){
        if(num < 10){
            System.out.println(num);
        }else{
            if(num % 10 != 0){
                System.out.println(num % 10);
            }
            show((int)(num/10));
        }
    }
}