package com.wzy.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IAdapter5V{

    @Override
    public int output5V() {
        int src = output();
        //电压转换 220V -> 5V
        int dst = src/44;
        return dst;
    }
}
