package arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise01 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("红楼梦", 99);
        books[1] = new Book("水浒传", 67);
        books[2] = new Book("三国演义", 89);
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) { //重写，形参范围大于等于实现的抽象类，故为Object的形式
                Book b1 = (Book)o1; //向下转型，使用属性
                Book b2 = (Book)o2;
                double change = b1.getName().length()-b2.getName().length();
                if(change > 0){
                    return -1; //调整1和-1的位置实现正序或倒叙排序
                }else if(change == 0){
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Book{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

//    public static void sort(Book[] books, Comparator c){
//        Book temp = null;
//        for (int i = 0; i < books.length-1; i++) {
//            for (int j = 0; j < books.length-1-i; j++) {
//                if(c.compare(books[j],books[j+1])<0){
//                    temp = books[j];
//                    books[j] = books[j+1];
//                    books[j+1] = temp;
//                }
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}