package collectionExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 1; i <= 11; i++) {
            list.add("hello" + i);
        }
        list.add(1,"教育");
//        System.out.println(list.get(4));
        list.remove(5);
        list.set(6,"修改");
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        //普通for循环实现遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
