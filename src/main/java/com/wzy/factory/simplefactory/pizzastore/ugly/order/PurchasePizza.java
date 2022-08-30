package com.wzy.factory.simplefactory.pizzastore.ugly.order;

import com.wzy.factory.simplefactory.pizzastore.ugly.pizza.CheesePizza;
import com.wzy.factory.simplefactory.pizzastore.ugly.pizza.GreekPizza;
import com.wzy.factory.simplefactory.pizzastore.ugly.pizza.PepperPizza;
import com.wzy.factory.simplefactory.pizzastore.ugly.pizza.Pizza;

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
public class PurchasePizza {
    public PurchasePizza(){
        Pizza pizza = null;
        String orderType; //购买Pizza类型
        do{
            orderType = gettype();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName(orderType);
            }else if(orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName(orderType);
            }else if(orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName(orderType);
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
