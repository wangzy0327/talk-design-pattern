package com.wzy.factory.simplefactory.pizzastore.advance.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(name+" prepareing");
    }


}
