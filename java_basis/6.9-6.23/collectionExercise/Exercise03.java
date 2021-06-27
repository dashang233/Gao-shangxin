package collectionExercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exercise03 {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add(new Book("书一",11.1,"作者一"));
        list.add(new Book("书二",33.3,"作者二"));
        list.add(new Book("书三",22.2,"作者三"));
        Book.sort(list);
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
class Book{
    private String name;
    private double price;
    private String writer;
    public static void sort(List list){
        int listSize = list.size();
        for (int i = 0; i < listSize-1; i++) {
            for (int j = 0; j < listSize-1-i; j++) {
                Book b1 = (Book)list.get(j);
                Book b2 = (Book)list.get(j+1);
                if(b1.getPrice() > b2.getPrice()){
                    //交换顺序只需用set方法即可，前面已有新创建的b1、b2
                    list.set(j,b2);
                    list.set(j+1,b1);
                }
            }
        }
    }

    public Book(String name, double price, String writer) {
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\t' +
                "price=" + price +'\t'+
                "writer='" + writer ;
    }
}