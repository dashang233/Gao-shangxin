package innerClass;

//匿名内部类
public class AnonymousInnerClass {
    public static void main(String[] args) {
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫");
            }
        };
        tiger.cry();
        System.out.println(tiger.getClass());
        Father son = new Father("Tom"){
            @Override
            public void speak() {
                System.out.println("唱歌");
            }
        };
        son.speak();
        System.out.println(son.getClass());
    }
}
interface IA{
    public void cry();
}
class Father{
    private String name;

    public Father(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("说话~");
    }
}