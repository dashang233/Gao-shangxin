package list_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings({"All"})
public class Set01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Tom");
        set.add(null);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println("=====");
        for(Object o : set){
            System.out.print(o+"\t");
        }
    }
}
