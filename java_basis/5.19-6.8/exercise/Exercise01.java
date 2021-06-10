package exercise;

public class Exercise01 {
    public static void main(String[] args) {
//        Frock f1 = new Frock();
//        System.out.println(Frock.getNextNum());
////        Frock f2 = new Frock();
//        System.out.println(Frock.getNextNum());
        Frock f1 = new Frock();
        Frock f2 = new Frock();
        Frock f3 = new Frock();
        System.out.println(f1.getSerialNumber() + "\t" + f2.getSerialNumber() + "\t" + f3.getSerialNumber());
    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNumber;
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }
}