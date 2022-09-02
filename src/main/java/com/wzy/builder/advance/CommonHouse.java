package com.wzy.builder.advance;

public class CommonHouse extends HouseBuilder{
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    void buildWall() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    void roofed() {
        System.out.println("普通房子封顶");
    }
}
