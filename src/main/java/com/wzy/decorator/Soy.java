package com.wzy.decorator;

//具体的Decorator , 这里就是调味品具体实现
public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
        super.setDes("豆子");
        super.setPrice(1.5f); // 调味品的价格
    }
}
