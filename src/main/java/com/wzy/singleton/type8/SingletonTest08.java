package com.wzy.singleton.type8;

import org.apache.commons.lang3.SerializationUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest08 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

//        true
//        985922955
//        985922955

        System.out.println("-----------反射攻击------------");
        Singleton s = Singleton.INSTANCE;
        // 拿到所有的构造函数，包括非public的
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        // 使用空构造函数new一个实例。即使它是private的~~~
//        Singleton sReflection = constructor.newInstance();
//        System.out.println(s); //com.wzy.bean.Singleton@1f32e575
//        System.out.println(sReflection); //com.wzy.bean.Singleton@279f2327
//        System.out.println(s == sReflection); // false
        /**
         *
         * Exception in thread "main" java.lang.NoSuchMethodException: com.wzy.singleton.type8.Singleton.<init>()
         * 	at java.base/java.lang.Class.getConstructor0(Class.java:3349)
         * 	at java.base/java.lang.Class.getDeclaredConstructor(Class.java:2553)
         * 	at com.wzy.singleton.type8.SingletonTest08.main(SingletonTest08.java:21)
         *
         */

        /**
         *         -----------反射攻击------------
         *         Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
         * 	        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:484)
         *         at com.wzy.singleton.type8.SingletonTest08.main(SingletonTest08.java:25)
         */





        System.out.println("-----------序列化/反序列化攻击---------------");

        byte[] serialize = SerializationUtils.serialize(s);
        Object deserialize = SerializationUtils.deserialize(serialize);
        System.out.println(s == deserialize); //true

        /**
         * true
         */

    }
}

/**
 * 枚举  (线程安全，防止反射攻击、防止序列化攻击)
 */
enum Singleton{
    INSTANCE;
}

