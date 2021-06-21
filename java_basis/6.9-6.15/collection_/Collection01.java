package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Tom");
        list.add(10); //自动装箱为Integer
        list.add(true); //自动装箱
//        list.remove(new Integer(10));
        ArrayList list2 = new ArrayList();
        list2.add("三国演义");
        list2.add("红楼梦");
        list.addAll(list2);
        System.out.println(list);
    }
}
