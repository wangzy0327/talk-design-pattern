package com.wzy.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println(" 北京奶酪pizza "+" prepareing");
    }


}
