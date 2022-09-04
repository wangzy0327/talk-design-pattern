package com.wzy.bridge;

//直立式手机类，继承 抽象类 Phone
public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand){
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立式样式手机");
    }

    public void close(){
        super.close();
        System.out.println("直立式样式手机");
    }

    public void call(){
        super.call();
        System.out.println("直立式样式手机");
    }

}
