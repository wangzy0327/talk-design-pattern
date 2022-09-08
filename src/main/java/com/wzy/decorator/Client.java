package com.wzy.decorator;

public class Client {
    public static void main(String[] args) {
        //装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

//        1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("order 费用1(单品) = "+order.cost());
        System.out.println("order 描述 = "+order.getDes());

        //2.加一份牛奶
        order = new Milk(order);

        System.out.println("order 加入一份牛奶 费用 = "+order.cost());
        System.out.println("order 加入一份牛奶 描述 = "+order.getDes());

        //3.加一份巧克力
        order = new Chocolate(order);

        System.out.println("order 加入一份巧克力 费用 = "+order.cost());
        System.out.println("order 加入一份巧克力 描述 = "+order.getDes());

        //4.再加一份巧克力
        order = new Chocolate(order);

        System.out.println("order 加入一份牛奶 加入两份巧克力 费用 = "+order.cost());
        System.out.println("order 加入一份牛奶 加入两份巧克力 描述 = "+order.getDes());

        /**
         *
         *         费用1(单品) = 5.0
         *         描述 = longblack
         *         order 加入一份牛奶 费用 = 7.0
         *         order 加入一份牛奶 描述 = 牛奶 2.0 && longblack
         *         order 加入一份巧克力 费用 = 10.0
         *         order 加入一份巧克力 描述 = 巧克力 3.0 && 牛奶 2.0 && longblack
         *         order 加入一份牛奶 加入两份巧克力 费用 = 13.0
         *         order 加入一份牛奶 加入两份巧克力 描述 = 巧克力 3.0 && 巧克力 3.0 && 牛奶 2.0 && longblack
         *
         */

    }
}
