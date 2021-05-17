package extends_;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 1000, "Dell");
        pc.getInfo1();

    }
}

class Computer{
    String CPU;
    int storage;
    int disk;
    public Computer(){};
    public Computer(String CPU, int storage, int disk) {
        this.CPU = CPU;
        this.storage = storage;
        this.disk = disk;
    }

    public String getDetails(){
        return "CPU是：" + CPU + ",内存是：" + storage + "硬盘是" + disk;
    }
}
class PC extends Computer{
    String brand;
    public PC(){};
    public PC(String CPU, int storage, int disk, String brand) {
        super(CPU, storage, disk);
        this.brand = brand;
    }
    public void getInfo1(){
        System.out.println(getDetails() + ",品牌是" + brand);
    }
}
class Phone extends PC{
    public  String getInfo2(){
        return super.CPU;
    }
}


