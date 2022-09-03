package com.wzy.adapter.classadapter;

public class Phone {

    //充电
    public void charging(IAdapter5V adapter5V){
        if(adapter5V.output5V() == 5){
            System.out.println("电压为5V,可以充电~");
        }else{
            System.out.println("电压非5V,不可以充电！");
        }
    }
}
