package com.wzy.factory.factorymethod.pizzastore.order;



/**
 * client 相当于一个客户端，发出订购
 */
public class PizzaStore {
    public static void main(String[] args) {
        String loc = "bj";
        OrderPizza orderPizza = null;
        if(loc.equals("bj")){
            //创建北京口味
            orderPizza = new BJOrderPizza();
        }else{
            orderPizza = new LDOrderPizza();
        }

        System.out.println("~~退出程序~~");
    }
}
