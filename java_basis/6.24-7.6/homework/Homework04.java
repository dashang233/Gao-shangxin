package homework;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Homework04 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1", new User(1,11,"Tom"));
        userDAO.save("2", new User(2,22,"Jack"));
        userDAO.save("3", new User(3,33,"Mary"));
        System.out.println(userDAO.get("1"));
        userDAO.update("1",new User(5,55,"Bob"));
        System.out.println(userDAO.list());
        userDAO.delete("2");
        System.out.println(userDAO.list());

    }
}
class DAO<T>{
    private Map<String, T> map = new HashMap<>(); //这里需要创建对象
    public void save(String id, T entity){
        map.put(id, entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id, T entity){
        map.put(id, entity);
    }
    public List<T> list(){
//        return map.values(); //返回的是Collection类型
        List<T> list = new ArrayList<>(); //限定了list添加元素的类型
        Collection<T> values = map.values();
        for (T t : values) {
            list.add(t);
        }
        return list;

    }
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}