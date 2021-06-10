package exercise;

import javax.sound.midi.Soundbank;

public class Exercise03 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Cal(){
            @Override
            public double work(double d1, double d2) {
                return d1 + d2;
            }
        },1.1,2.2);
    }
}

interface Cal{
    public double work(double d1, double d2);

}
class CellPhone{
    public void testWork(Cal c, double d1, double d2){
        System.out.println(c.work(d1, d2)); //动态绑定，运行类型为匿名内部了
    }
}