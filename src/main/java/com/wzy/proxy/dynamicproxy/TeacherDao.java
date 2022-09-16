package com.wzy.proxy.dynamicproxy;

//被代理类
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }

    @Override
    public String sayHello(String name) {
        System.out.println("hello "+name);
        return name;
    }
}
