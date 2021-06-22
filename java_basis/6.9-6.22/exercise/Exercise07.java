package exercise;

public class Exercise07 {
    public static void main(String[] args) {
        Car car = new Car(-1);
        Car car1 = new Car(10);
        Car car2 = new Car(60);
//        car.new Air().flow(); //将new Air() 看作对象的一个属性进行调用
//        car1.new Air().flow();
//        car2.new Air().flow();
        car.getAir().flow();
        car1.getAir().flow();
        car2.getAir().flow();
    }
}
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }
    class Air{ //成员内部类，监控车内温度
        public void flow(){
            if(temperature > 40){
                System.out.println("吹冷气");
            }else if(temperature < 0){
                System.out.println("吹暖气");
            }else{
                System.out.println("关机");
            }
        }
    }
    public Air getAir(){ //返回成员内部类对象
        return new Air();
    }

}