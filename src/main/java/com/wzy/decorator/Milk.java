package com.wzy.decorator;

//具体的Decorator , 这里就是调味品具体实现
public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        super.setDes("牛奶");
        super.setPrice(2.0f); // 调味品的价格
    }
}
