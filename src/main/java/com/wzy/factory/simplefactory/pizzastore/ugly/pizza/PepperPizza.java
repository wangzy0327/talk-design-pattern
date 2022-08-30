package com.wzy.factory.simplefactory.pizzastore.ugly.pizza;

public class PepperPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(name+" prepareing");
    }
}
