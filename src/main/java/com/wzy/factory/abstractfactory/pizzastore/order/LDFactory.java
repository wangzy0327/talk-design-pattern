package com.wzy.factory.abstractfactory.pizzastore.order;

import com.wzy.factory.abstractfactory.pizzastore.pizza.*;

//这是工厂子类
public class LDFactory implements AbsFactory{

    private static volatile LDFactory INSTANCE;
    private LDFactory(){}

    public static LDFactory getInstance(){
        if(INSTANCE == null){
            synchronized (LDFactory.class){
                if(INSTANCE == null)
                    INSTANCE = new LDFactory();
            }
        }
        return INSTANCE;
    }
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
