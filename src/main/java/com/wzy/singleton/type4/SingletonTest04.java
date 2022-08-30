package com.wzy.singleton.type4;

public class SingletonTest04 {
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
 * 懒汉式（线程安全、同步方法）
 */
class Singleton{
    private static Singleton instance;
    private Singleton(){}  // 私有构造函数
    public static synchronized Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
