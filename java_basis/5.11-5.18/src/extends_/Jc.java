package extends_;


public class Jc {
    public static void main(String[] args) {
        int n = 4;
        Jc j = new Jc();
        System.out.println(j.jc(n));
    }
    public int jc(int n){
        if(n == 1){
            return 1;
        }else{
            return jc(n-1)*n;
        }
    }
}
