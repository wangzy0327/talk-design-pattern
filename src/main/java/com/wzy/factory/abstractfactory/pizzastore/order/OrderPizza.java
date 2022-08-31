package com.wzy.factory.abstractfactory.pizzastore.order;


import com.wzy.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    private AbsFactory absFactory;

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
    }

    public void createPizza(){
        if(absFactory == null)
            return;
        do {
            String type = gettype();
            //这里生成披萨会下沉到具体工厂实现类里去实现
            Pizza pizza = absFactory.createPizza(type);
            if(pizza != null){
                System.out.println("~使用抽象工厂模式~");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }
        }while (true);
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    protected String gettype(){
        String str = "";
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type : ");
            str = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            return str;
        }
    }

}
