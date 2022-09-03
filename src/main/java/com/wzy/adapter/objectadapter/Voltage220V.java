package com.wzy.adapter.objectadapter;

public class Voltage220V {
    private int src = 220;
    public int output(){
        System.out.println("源电源电压 = "+src+" V");
        return src;
    }
}
