package com.wzy.factory.simplefactory.pizzastore.advance.order;

import com.wzy.factory.simplefactory.pizzastore.advance.pizza.CheesePizza;
import com.wzy.factory.simplefactory.pizzastore.advance.pizza.GreekPizza;
import com.wzy.factory.simplefactory.pizzastore.advance.pizza.PepperPizza;
import com.wzy.factory.simplefactory.pizzastore.advance.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 这里订购披萨，如果要添加新的披萨 将会添加新的披萨类，OrderPizza类也需要跟着修改
 *
 * 分析：修改代码可以接受，但是如果我们在其他地方也有创建Pizza的代码，就意味着，也需要修改，而创建Pizza的代码，往往有多处
 *
 * 思路：把创建Pizza对象封装到一个类中，这样我们有新的Pizza种类时，只需要修改该类就可，其它有创建Pizza对象的代码就不需要修改了
 *
 * -》简单工厂模式
 */
public class OrderPizza {
    //定义简单工厂对象
    private SimpleFactory simpleFactory;

    private Pizza pizza = null;

    private void setFactory(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }

    public OrderPizza(SimpleFactory simpleFactory){
        System.out.println("订购披萨....");
        setFactory(simpleFactory);
        do{
            String orderType = gettype();
            pizza = simpleFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }
        }while(true);
    }



    //写一个方法，可以获取客户希望订购的披萨种类
    private String gettype(){
        String str = "";
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type : ");
            str = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            return str;
        }
    }

}
