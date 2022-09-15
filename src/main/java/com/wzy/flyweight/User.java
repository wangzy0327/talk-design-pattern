package com.wzy.flyweight;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    //采用链式调用方法
    public User setName(String name) {
        this.name = name;
        return this;
    }
}
