package exercise;

public class Exercise02 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}
abstract class Animal{
    public abstract void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("喵");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪");
    }
}



