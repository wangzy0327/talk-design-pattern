package com.wzy.singleton.type1;

public class SingletonTest01{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
//        true
//        985922955
//        985922955
    }
}

/**
 * 饿汉式（静态变量）
 */
class Singleton {
    private final static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
