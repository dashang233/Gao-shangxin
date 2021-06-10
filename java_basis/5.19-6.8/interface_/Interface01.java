package interface_;

public class Interface01 {
    public static void main(String[] args) {
        Usb[] usb = new Usb[2];
        usb[0] = new Phone();
        usb[1] = new Camera();
        Interface01 i = new Interface01();
        i.show(usb);
    }
    public void show(Usb[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Phone){
                System.out.println(arr[i]);
                ((Phone) arr[i]).call(); //向下转型
            }else{
                System.out.println(arr[i]);
            }

        }
    }
}
interface Usb { }
class Phone implements Usb{
    public void call(){
        System.out.println("111");
    }
}
class Camera implements Usb{

}