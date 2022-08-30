package com.wzy.factory.simplefactory.pizzastore.advance.order;

/**
 * client 相当于一个客户端，发出订购
 */
public class PizzaStore {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = SimpleFactory.getInstance();
        Thread[] threads = new Thread[5];
        for(Thread thread : threads){
            thread = new Thread(()-> {
                SimpleFactory factory = SimpleFactory.getInstance();
                System.out.println("thread "+Thread.currentThread().getName()+" factory : "+factory.hashCode());
            });
            thread.start();
        }
        new OrderPizza(simpleFactory);
        new PurchasePizza(simpleFactory);
        System.out.println("~~退出程序~~");
    }
}
