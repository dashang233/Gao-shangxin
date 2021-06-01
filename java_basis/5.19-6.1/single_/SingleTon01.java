package single_;

import javax.swing.table.AbstractTableModel;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend gf = GirlFriend.creat();
    }
}
class GirlFriend{
    private String name;
    private GirlFriend(String name){
        this.name = name;
    }
    private static GirlFriend gf = new GirlFriend("小花");//静态只加载一次
    public static GirlFriend creat(){ //无需创建对象即可调用
        return gf;
    }
}