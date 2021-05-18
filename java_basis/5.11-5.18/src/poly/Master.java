package poly;

public class Master {
    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.feed(); //编译要求Animal需要有feed方法
//        animal = new Cat();
//        animal.feed();
        Master master = new Master();
        master.feed1(new Dog());
        master.feed1(new Cat());

        Animal animal = new Cat();
        Cat cat = (Cat)animal;
        cat.say();
    }
    public void feed1(Animal animal){
        animal.feed();
    }
}
