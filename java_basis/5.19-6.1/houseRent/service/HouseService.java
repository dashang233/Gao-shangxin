package houseRent.service;

import houseRent.domain.House;
import houseRent.utils.Utility;

public class HouseService {
    private House[] houses; //保存Houses对象
    private int houseNum = 1; //记录数组中房屋数量
    private int idCounter = 1; //记录自增长的id

    public HouseService(int size){ //构造器指定数组大小
        houses = new House[size];
        houses[0] = new House(1,"jack","112","胜利小区",3000,"未出租");
    }
    //查全部
    public House[] list(){
        return houses;
    }
    //查某个
    public House find(int id){
        for (int i = 0; i < houseNum; i++) {
            if(id == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
//    //改
//    public void modify(int id){
//        for (int i = 0; i < houseNum; i++) {
//            if(id == houses[i].getId()){
//                System.out.println("姓名(" + houses[i].getId() + "):");
//                houses[i].setName(Utility.readString(5));
//                System.out.println("修改成功！");
//            }else{
//                System.out.println("未找到");
//            }
//        }
//
//    }
    //增
    public void add(House newHouse){ //返回真假，判断是否加入成成功
        if(houseNum == houses.length){ //长度满了,扩容
            House[] houses1 = new House[houseNum+10];
            for (int i = 0; i < houses.length; i++) {
                houses1[i] = houses[i];
            }
            houses = houses1;
        }else{
            newHouse.setId(++idCounter); //更新房屋id号
            houses[houseNum++] = newHouse;
        }
    }
    public boolean del(int delId){
        int index = -1; //记录删除的房屋编号对应的数组下标
        for (int i = 0; i < houseNum; i++) {
            if(delId == houses[i].getId()){ //判断对应的id值
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        for (int i = index; i < houseNum-1; i++) { //注意要-1
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null; //将当前存在的最后一个元素设为空,房屋数量减1
        return true;
    }
}



