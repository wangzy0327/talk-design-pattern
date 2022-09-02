package com.wzy.builder;

public class HighBuilding extends AbstractHouse {
    @Override
    void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    void buildWall() {
        System.out.println("高楼砌墙");
    }

    @Override
    void roofed() {
        System.out.println("高楼封顶");
    }
}
