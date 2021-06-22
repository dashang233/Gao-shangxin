package arrays_;

import java.util.Arrays;

public class Sort02 {
    public static void main(String[] args) {
        Book1[] books = new Book1[3];
        books[0] = new Book1("红楼梦", 99);
        books[1] = new Book1("水浒传", 67);
        books[2] = new Book1("三国演义", 89);
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}
class Book1 implements Comparable{
    private String name;
    private int price;
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public Book1(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        Book1 b = (Book1)o;
        return this.getPrice()-b.getPrice();
    }


}