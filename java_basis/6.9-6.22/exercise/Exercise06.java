package exercise;


public class Exercise06 {
    public static void main(String[] args) {
        Person Tang = new Person("唐僧", new Horse());
        Tang.normal();
        Tang.passRiver();
        Tang.normal();
        Tang.passRiver();
        Tang.fly();
        Tang.passRiver();
    }
}
interface Vehicles{
    public void work();

}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("骑马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐船");
    }
}
class Airplane implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐飞机");
    }
}
class Factory{ //简单工厂类，获得对象
    private static Horse horse = new Horse(); //饿汉式
    private Factory(){}; //私有化构造器
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Airplane getAirplane(){
        return new Airplane();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //简单 工厂模式
    public void passRiver(){
        if(!(vehicles instanceof Boat)){
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }
    public void normal(){
        if(!(vehicles instanceof Horse)){
            vehicles = Factory.getHorse(); //向上转型
        }
        vehicles.work(); //动态绑定
    }
    public void fly(){
        if(!(vehicles instanceof Airplane)){
            vehicles = Factory.getAirplane();
        }
        vehicles.work();
    }
}