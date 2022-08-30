package com.wzy.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

//        true
//        1435804085
//        1435804085
    }
}

/**
 * 静态内部类（线程安全）
 * 类加载器来保证对象创建的线程安全和懒加载。
 * 这种方式Singleton类被装载了，instance不会被立马初始化，因为SingletonHolder类没有被主动使用，
 * 只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，显然它达到了lazy loading效果。推荐使用。

 */
class Singleton{
    private Singleton(){}  // 私有构造函数
    static class SingletonInner{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInner.instance;
    }

}
