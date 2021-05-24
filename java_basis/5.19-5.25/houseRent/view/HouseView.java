package houseRent.view;

public class HouseView {
    private int key; //接收用户输入
    private boolean loop; //控制显示菜单
    public void mainMenu(){
        do {
            System.out.println("=========房屋出租系统=========");
            System.out.println("1 新增房源");
            System.out.println("2 查找房源");
            System.out.println("3 删除房屋信息");
            System.out.println("4 修改房屋信息");
            System.out.println("5 房屋列表");
            System.out.println("6 退出");
        }while(loop);
    }
}
