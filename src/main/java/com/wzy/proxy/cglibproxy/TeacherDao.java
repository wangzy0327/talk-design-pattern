package com.wzy.proxy.cglibproxy;

public class TeacherDao {
    public void teach(){
        System.out.println(" 老师授课中，我是cglib代理，不需要实现接口 ");
    }

    public String hello(String name){
        System.out.println(" cglib代理 say Hello "+name);
        return name;
    }
}
