package com.wzy.adapter.objectadapter;

public class VoltageAdapter implements IAdapter5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output();
        //电压转换 220V -> 5V
        int dst = src/44;
        return dst;
    }
}
