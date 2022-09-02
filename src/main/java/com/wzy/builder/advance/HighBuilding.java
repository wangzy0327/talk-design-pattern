package com.wzy.builder.advance;

public class HighBuilding extends HouseBuilder{
    @Override
    void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    void buildWall() {
        System.out.println("高楼砌墙20cm");
    }

    @Override
    void roofed() {
        System.out.println("高楼封顶");
    }
}
