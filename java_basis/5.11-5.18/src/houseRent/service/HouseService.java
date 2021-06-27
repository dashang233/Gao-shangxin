package houseRent.service;

import houseRent.house.House;

public class HouseService {
    private House[] houses;
    int houseNum = 1; //记录数组中数量
    int houseId = 1; //更新房屋id
    public HouseService(int n) {
        this.houses = new House[n];
        houses[0] = new House(1,"Tom", "123", "未央区", 1000, "未出租");
    }

    public void list(){
        for (int i = 0; i < houseNum; i++) {
            System.out.println(houses[i]);
        }
    }
    public void add(House newHouse){
        if(houseNum == houses.length){
            House[] houses1 = new House[houses.length+10];
            for (int i = 0; i < houseNum; i++) {
                houses1[i] = houses[i];
            }
            houses = houses1;
        }
        houses[houseNum++] = newHouse; //赋值后增长
        houses[houseNum-1].setId(++houseId); //更新id号
    }
    public boolean del(int id){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if(id == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        for (int i = index; i < houseNum-1; i++) {
            houses[i] = houses[i+1];
            houses[i].setId(i+1);
        }
        houses[--houseNum] = null;
        return true;
    }
    public House[] search(String address){
        House[] houses2 = new House[10];
        int count = 0;
        for (int i = 0; i < houseNum; i++) {
            if(houses[i].getAddress().equals(address)){
                houses2[count++] = houses[i];
            }
        }
        return houses2;
    }
    public House find(int id){
        for (int i = 0; i < houseNum; i++) {
            if(id == houses[i].getId()){
                return houses[i];
            }
        }
        return null; //没找到对应id就返回null
    }
}
