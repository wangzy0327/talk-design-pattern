package com.wzy.proxy.cglibproxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();

        //执行代理对象的方法，触发intercept方法，从而实现 对目标对象的调用
        proxyInstance.teach();

        String name = "Tom";

        String returnVal = proxyInstance.hello(name);

        System.out.println("cglib 代理方法返回值 ： "+returnVal);

        /**
         *
         * Cglib代理模式~~ 开始
         *  老师授课中，我是cglib代理，不需要实现接口
         * Cglib代理模式~~ 提交
         * Cglib代理模式~~ 开始
         *  cglib代理 say Hello Tom
         * Cglib代理模式~~ 提交
         * cglib 代理方法返回值 ： Tom
         *
         */

    }
}
