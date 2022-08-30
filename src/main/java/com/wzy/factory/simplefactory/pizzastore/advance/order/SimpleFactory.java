package com.wzy.factory.simplefactory.pizzastore.advance.order;

import com.wzy.factory.simplefactory.pizzastore.advance.pizza.CheesePizza;
import com.wzy.factory.simplefactory.pizzastore.advance.pizza.GreekPizza;
import com.wzy.factory.simplefactory.pizzastore.advance.pizza.PepperPizza;
import com.wzy.factory.simplefactory.pizzastore.advance.pizza.Pizza;


/**
 * 这里可以设计为单例模式的简单工厂类
 */
public class SimpleFactory {

    private static SimpleFactory INSTANCE;

    private SimpleFactory(){}

    public static SimpleFactory getInstance(){
        if(INSTANCE == null){
            synchronized (SimpleFactory.class){
                if(INSTANCE == null)
                    INSTANCE = new SimpleFactory();
            }
        }
        return INSTANCE;
    }

    /**
     * 根据orderType 返回对应的Pizza类
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(orderType);
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(orderType);
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName(orderType);
        }
        return pizza;
    }


}
