package com.wzy.factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println(" 伦敦胡椒pizza "+" prepareing");
    }


}
