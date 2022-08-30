package com.wzy.singleton.type6;

public class SingletonTest06 {
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
 * 懒汉式（线程安全、双重检验锁）
 */
class Singleton{
    private static volatile Singleton instance;
    private Singleton(){}  // 私有构造函数
    public static  Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
