package com.wzy.builder;

public class CommonHouse extends AbstractHouse {
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    void roofed() {
        System.out.println("普通房子封顶");
    }
}
