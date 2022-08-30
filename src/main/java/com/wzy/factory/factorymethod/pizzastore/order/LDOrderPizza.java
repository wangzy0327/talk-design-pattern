package com.wzy.factory.factorymethod.pizzastore.order;

import com.wzy.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.wzy.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.wzy.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza() {
        Pizza pizza = null;
        String orderType = gettype();
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
