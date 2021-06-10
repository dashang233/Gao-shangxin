package static_;

public class ChildGame {
    public static void main(String[] args) {
        Child tom = new Child("Tom");
        tom.play();
        Child tom1 = new Child("Tom");
        tom1.play();
    }
}
class Child{
    private String name;
    //定义类变量（静态变量）
    public static int count = 0; //该变量可被所有Child对象共享
    public void play(){
        System.out.println(name + "加入了游戏");
        count++;
        System.out.println(Child.count);

    }
//    private int count = 0;
//    public void play(){
//        System.out.println(name + "加入了游戏");
//        count++; //对象的count属性改变，不是类的
//        System.out.println(count);
//    }
    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}