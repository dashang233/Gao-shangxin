package homework;

import java.util.*;

public class Homework03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack", 650); //自动装箱为Integer
        map.put("tom", 1200);
        map.put("smith", 2900);
        //修改jack工资
        map.replace("jack", 2600); //或put()方法也等价于替换
        Set set = map.keySet();
        for(Object o : set){
//            Set s = (Set)o;
            map.replace(o,(Integer)(map.get(o))+100);
        }
//        Set keys = map.keySet();
//        for(Object o : keys){
//            System.out.println(o);
//        }
//        Collection values = map.values();
//        for(Object o : values){
//            System.out.println(o);
//        }
        Set set1 = map.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry next =  (Map.Entry)iterator.next(); //Set中存放的为Entry类型的对象
            System.out.println(next.getKey() + "-" + next.getValue());

        }
    }
}