package com.wzy.builder.advance;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        HouseBuilder commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        //盖完房子，返回产品(普通房子)
        House house = houseDirector.constructHouse();
        //产品主要取决于要素
        System.out.println(house);

        //盖高楼
        HouseBuilder highBuilding = new HighBuilding();
        //重置构造者
        houseDirector.setHouseBuilder(highBuilding);
        //盖完房子，返回产品(普通房子)
        House house2 = houseDirector.constructHouse();
        System.out.println(house2);
    }
}
