package stringBuffer;

import java.util.Scanner;

public class StringBuffer02 {
    private String name;
    private String price;
    public static void main(String[] args) {
        StringBuffer02 tom = new StringBuffer02();
        tom.show();
    }

    public StringBuffer02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称");
        this.name = scanner.next();
        System.out.println("请输入商品价格");
        this.price = scanner.next();
    }
    public void show(){
        StringBuffer s1 = new StringBuffer(price);
        int index = s1.lastIndexOf(".");
        for (int i = 3; i < index; i+=4) {
            s1.insert(i,",");
        }
        System.out.println("商品名\t\t商品价格");
        System.out.println(name+ "\t\t" + s1);
    }

}
