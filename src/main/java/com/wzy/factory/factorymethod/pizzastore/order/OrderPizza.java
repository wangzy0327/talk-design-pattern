package com.wzy.factory.factorymethod.pizzastore.order;


import com.wzy.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    public OrderPizza() {
        do {
            Pizza pizza = createPizza();
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }
        }while (true);
    }

    //定义一个抽象方法，createPizza,让各个工厂子类自己实现
    public abstract Pizza createPizza();


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
