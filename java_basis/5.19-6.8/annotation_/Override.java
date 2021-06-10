package annotation_;

public class Override {
}
class Father{
    public void fly(){

    }
}
class Son extends Father{

    @java.lang.Override
    public void fly() {
        super.fly();
    }
}