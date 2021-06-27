package houseRent.view;

import houseRent.Utility;
import houseRent.house.House;
import houseRent.service.HouseService;

public class HouseView {
    boolean loop = true;
    int key;
    private HouseService houseService= new HouseService(10);
    public void mainMenu(){
        do {
            System.out.println("=====房屋出租系统======");
            System.out.println("\t1 新增房源");
            System.out.println("\t2 查找房屋");
            System.out.println("\t3 删除房屋");
            System.out.println("\t4 修改房屋信息");
            System.out.println("\t5 房屋列表");
            System.out.println("\t6 退出");
            System.out.println("请输入选项(1-6)：");
            key = Utility.readInt();
            switch(key){
                case 1:
                    addHouse();
                    break;
                case 2:
                    searchHouse();
                    break;
                case 3:
                    delHouse();
                    break;
                case 4:
                    modifyHouse();
                    break;
                case 5:
                    listHouse();
                    break;
                case 6:
                    exit();
                    break;
            }
        }while(loop);
    }
    public void exit(){
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            loop = false;
            System.out.println("=====退出系统=====");
        }
    }
    public void listHouse(){
        System.out.println("=====房屋列表=====");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        houseService.list();
    }
    public void addHouse(){
        System.out.println("=====添加房屋=====");
        System.out.print("姓名：");
        String name = Utility.readString(5);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(10);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        House newHouse = new House(1,name,phone,address,rent,state);
        houseService.add(newHouse);
        System.out.println("=====添加房屋成功=====");
    }
    public void delHouse(){
        System.out.println("=====删除房屋信息=====");
        System.out.println("请选择删除的房屋编号(-1退出)：");
        int id = Utility.readInt();
        if(id == -1){
           return;
        }
        System.out.println("请再次确认是否删除(Y/N):");
        char answer = Utility.readConfirmSelection();
        if (answer == 'Y') {
            if(houseService.del(id)){
                System.out.println("删除成功");
            }else{
                System.out.println("未找到对应id,请重新输入");
            }
        }else{
            System.out.println("取消输入");
        }
    }
    public void searchHouse(){
        System.out.println("=====查找房源=====");
        System.out.println("请输入查找的房屋地址：");
        String address = Utility.readString(5);
        House[] houses2 = houseService.search(address);
        if(houses2[0] == null){
            System.out.println("未找到对应房源");
            return;
        }
        for (int i = 0; i < houses2.length; i++) {
            if(houses2[i] == null){
                return;
            }
            System.out.println(houses2[i]);
        }
    }
    public void modifyHouse(){
        System.out.println("=====修改房屋信息=====");
        System.out.println("请选择修改房屋的编号(-1退出)：");
        int id = Utility.readInt();
        if(id == -1){
            System.out.println("取消修改");
            return;
        }
        House house = houseService.find(id);
        if (house != null) {
            System.out.print("姓名：("+house.getName()+"):");
            String name = Utility.readString(5,"");
            if(!"".equals(name)){ //输入非空
                house.setName(name);
            }
            System.out.print("电话：("+house.getPhone()+"):");
            String phone = Utility.readString(11);
            if(!"".equals(phone)){
                house.setPhone(phone);
            }
            System.out.println("修改成功！");
        }else{
            System.out.println("未找到对应id");
        }

//        System.out.print("电话：("+house.getName()+"):");
//        house.setPhone(Utility.readString(11));
//        System.out.print("地址：("+house.getName()+"):");
//        house.setAddress(Utility.readString(10));
//        System.out.print("租金：("+house.getName()+"):");
//        house.setRent(Utility.readInt());
//        System.out.print("状态：("+house.getName()+"):");
//        house.setState(Utility.readString(3));
//        System.out.println("修改成功！");
    }
}
