package com.wzy.factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println(" 北京胡椒pizza "+" prepareing");
    }


}
