package houseRent.view;

import houseRent.domain.House;
import houseRent.service.HouseService;
import houseRent.utils.Utility;

import javax.rmi.CORBA.Util;
import javax.xml.transform.Source;

public class HouseView {
    private int key; //接收用户菜单选项输入
    private boolean loop = true; //控制显示菜单
    private HouseService houseService = new HouseService(2);//显示初始化属性，设置存放房屋的数组长度为10
    public void mainMenu(){
        do {
            System.out.println("=========房屋出租系统=========");
            System.out.println("1 新增房源");
            System.out.println("2 查找房源");
            System.out.println("3 删除房屋信息");
            System.out.println("4 修改房屋信息");
            System.out.println("5 房屋列表");
            System.out.println("6 退出");
            System.out.println("请输入选项(1-6):");
            key = Utility.readChar();
            switch(key) {
                case '1':
                    this.addHouses();
                    break;
                case '2':
                    findHouses();
                    break;
                case '3':
                    delHouses();
                    break;
                case '4':
                    modifyHouses();
                    break;
                case '5':
                    this.listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while(loop);
    }
    public void listHouses(){
        System.out.println("=====房屋列表=====");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（已出租/未出租）");
        House[] houses = houseService.list();//获取所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=====房屋列表显示完毕=====");
    }
    public void addHouses(){
        System.out.println("=====添加房屋信息=====");
        System.out.print("姓名：");
        String name = Utility.readString(5);
        System.out.print("电话：");
        String number = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(5);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态(已出租/未出租)：");
        String state = Utility.readString(3);
        House house = new House(0,name,number,address,rent,state);
        houseService.add(house);
        System.out.println("=====添加房屋成功=====");
    }
    public void delHouses(){
        System.out.println("=====删除房屋信息=====");
        System.out.println("请选择待删除的房屋编号（-1退出）：");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("=====取消删除房屋信息=====");
            return;
        }
        System.out.println("=====确认是否删除(y/n)=====");
        char choice = Utility.readConfirmSelection(); //本身就有循环判断逻辑，必须输入y/n
        if(choice == 'Y'){
            if (houseService.del(delId)){
                System.out.println("=====删除房屋信息成功=====");
            }else{
                System.out.println("=====未找到编号对应房屋=====");
            }
        }else{
            System.out.println("=====取消删除信息=====");
        }
    }
    public void exit(){
        System.out.println("确认退出吗(Y/N)");
        char answer = Utility.readConfirmSelection();
        if(answer == 'Y'){
            loop = false;
            System.out.println("退出系统...");
        }
    }
    public void findHouses(){
        System.out.println("=====查找房屋信息=====");
        System.out.println("请输入查找的id号：");
        int id = Utility.readInt();
        House house = houseService.find(id);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("未找到id对应房源");
        }
    }
    public void modifyHouses(){
        System.out.println("=====修改房屋信息(-1退出)=====");
        System.out.println("请输入要修改的房屋id:");
        int id = Utility.readInt();
        if(id == -1){
            return;
        }
        House house = houseService.find(id);
        if(house != null){
            System.out.println("姓名(" + house.getName() + "):");
            String name = Utility.readString(5,"");
            if(!"".equals(name)){
                house.setName(name);
                System.out.println("修改成功！");
            }
        }else{
            System.out.println("未找到对应id");
        }
    }
}
