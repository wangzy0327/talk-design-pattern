package com.wzy.prototype.advance;


public class Client {
    public static void main(String[] args) {
        //原型模式
        System.out.println("~原型模式来完成对象的创建克隆~");
        Sheep tom = new Sheep("Tom",1,"白色");
        Sheep sheep2 = tom.clone(); //克隆
        Sheep sheep3 = tom.clone();
        Sheep sheep4 = tom.clone();
        Sheep sheep5 = tom.clone();
        //...

        System.out.println("tom = "+tom);
        System.out.println("sheep2 = "+sheep2);
        System.out.println("sheep3 = "+sheep3);
        System.out.println("sheep4 = "+sheep4);
        System.out.println("sheep5 = "+sheep5);
        /**
         ~原型模式来完成对象的创建克隆~
         tom = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'}
         sheep2 = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'}
         sheep3 = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'}
         sheep4 = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'}
         sheep5 = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'}
         */
    }
}
