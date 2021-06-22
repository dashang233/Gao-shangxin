package collection_;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("三国演义");
        list.add("红楼梦");
        list.add(1,"Tom");
        List list2 = new ArrayList();
        list2.add("Jerry");
        list2.add("Mary");
        list.addAll(2,list2);
        System.out.println(list);
        System.out.println(list.indexOf("Tom"));
        List list1 = list.subList(0, 2);
        System.out.println(list1);
    }
}
