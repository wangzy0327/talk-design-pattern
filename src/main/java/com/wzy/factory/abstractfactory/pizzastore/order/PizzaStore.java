package com.wzy.factory.abstractfactory.pizzastore.order;




/**
 * client 相当于一个客户端，发出订购
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.setAbsFactory(BJFactory.getInstance());
        orderPizza.createPizza();
        orderPizza.setAbsFactory(LDFactory.getInstance());
        orderPizza.createPizza();
        System.out.println("~~退出程序~~");
    }
}
