package com.wzy.template;

//花生豆浆
public class PeanutSoyMilk extends SoyMilk{
    @Override
    void addCondiments() {
        System.out.println("第二步：加入花生 ");
    }
}
