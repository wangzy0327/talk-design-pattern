package com.wzy.composite;

//College 就是Leaf，不会再包含别的
public class Department extends OrganizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }

    // add remove 就不用写了，因为它是叶子节点

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
