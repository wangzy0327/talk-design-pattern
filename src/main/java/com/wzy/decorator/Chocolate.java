package com.wzy.decorator;

//具体的Decorator , 这里就是调味品具体实现
public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        super.setDes("巧克力");
        super.setPrice(3.0f); // 调味品的价格
    }
}
