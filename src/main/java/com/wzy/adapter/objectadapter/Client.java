package com.wzy.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("=======对象适配器模式=====");
        Phone phone = new Phone();
        IAdapter5V adapter5V = new VoltageAdapter(new Voltage220V());
        phone.charging(adapter5V);

        /**
         * =======对象适配器模式=====
         * 源电源电压 = 220 V
         * 电压为5V,可以充电~
         */
    }
}
