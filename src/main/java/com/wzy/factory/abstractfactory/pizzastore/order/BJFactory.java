package com.wzy.factory.abstractfactory.pizzastore.order;

import com.wzy.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.wzy.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import com.wzy.factory.abstractfactory.pizzastore.pizza.Pizza;

//这是工厂子类
//这里可以设置为单例模式
public class BJFactory implements AbsFactory{
    private static volatile BJFactory INSTANCE;
    private BJFactory(){}

    public static BJFactory getInstance(){
        if(INSTANCE == null){
            synchronized (BJFactory.class){
                if(INSTANCE == null)
                    INSTANCE = new BJFactory();
            }
        }
        return INSTANCE;
    }
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
