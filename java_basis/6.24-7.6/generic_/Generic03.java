package generic_;

public class Generic03 {
    public static void main(String[] args) {
        Tiger<String, Integer,String > tiger = new Tiger<>("Tom", 12, "吃饭");
        System.out.println(tiger);

    }
}
class Tiger<T,R,M>{
    private T name;
    private R age;
    private M hobby;

    public Tiger(T name, R age, M hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public R getAge() {
        return age;
    }

    public void setAge(R age) {
        this.age = age;
    }

    public M getHobby() {
        return hobby;
    }

    public void setHobby(M hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name=" + name +
                ", age=" + age +
                ", hobby=" + hobby +
                '}';
    }
}