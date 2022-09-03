package com.wzy.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {

        System.out.println("=========接口适配器==========");
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void op1() {
                super.op1();
                System.out.println("使用了op1的方法");
            }
        };
        absAdapter.op1();

        /**
         * =========接口适配器==========
         * 使用了op1的方法
         */
    }
}
