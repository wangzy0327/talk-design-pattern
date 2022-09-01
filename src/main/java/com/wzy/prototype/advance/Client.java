package com.wzy.prototype.advance;


public class Client {
    public static void main(String[] args) {
        //原型模式
        System.out.println("~原型模式来完成对象的创建克隆~");
        Sheep tom = new Sheep("Tom",1,"白色");
        //设置tom的friend属性
        tom.setFriend(new Sheep("Alex",2,"红色"));
        Sheep sheep2 = tom.clone(); //克隆
        Sheep sheep3 = tom.clone();
        Sheep sheep4 = tom.clone();
        Sheep sheep5 = tom.clone();
        //...

        System.out.println("tom = "+tom +" tom.friend = "+tom.getFriend().hashCode());
        System.out.println("sheep2 = "+sheep2+" sheep2.friend = "+sheep2.getFriend().hashCode());
        System.out.println("sheep3 = "+sheep3+" sheep3.friend = "+sheep3.getFriend().hashCode());
        System.out.println("sheep4 = "+sheep4+" sheep4.friend = "+sheep4.getFriend().hashCode());
        System.out.println("sheep5 = "+sheep5+" sheep5.friend = "+sheep5.getFriend().hashCode());
        /**
         ~原型模式来完成对象的创建克隆~
         friend的hashcode一样，说明是浅拷贝
         ~原型模式来完成对象的创建克隆~
         tom = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'} tom.friend = 1504109395
         sheep2 = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'} sheep2.friend = 1504109395
         sheep3 = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'} sheep3.friend = 1504109395
         sheep4 = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'} sheep4.friend = 1504109395
         sheep5 = Sheep{name='Tom', age=1, color='白色', address='蒙古羊'} sheep5.friend = 1504109395
         */
    }
}
