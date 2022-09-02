package com.wzy.builder;

public class Client {
    public static void main(String[] args) {
        AbstractHouse house = new CommonHouse();
//        AbstractHouse house = new HighBuilding();
        house.build();
        /**
         * 普通房子打地基
         * 普通房子砌墙
         * 普通房子封顶
         */
    }
}
