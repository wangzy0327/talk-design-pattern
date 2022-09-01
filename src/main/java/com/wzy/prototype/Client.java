package com.wzy.prototype;

public class Client {
    public static void main(String[] args) {
        //传统的方法
        Sheep tom = new Sheep("Tom",1,"白色");
        Sheep sheep2 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep3 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep4 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep5 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        //...

        System.out.println(tom);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        /**
         * Sheep{name='Tom', age=1, color='白色'}
         * Sheep{name='Tom', age=1, color='白色'}
         * Sheep{name='Tom', age=1, color='白色'}
         * Sheep{name='Tom', age=1, color='白色'}
         * Sheep{name='Tom', age=1, color='白色'}
         */
    }
}
