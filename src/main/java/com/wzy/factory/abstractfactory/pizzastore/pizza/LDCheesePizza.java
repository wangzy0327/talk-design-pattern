package com.wzy.factory.abstractfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println(" 伦敦奶酪披萨 "+" prepareing");
    }


}
