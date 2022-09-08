package com.wzy.composite;


import java.util.ArrayList;
import java.util.List;

//University 就是Composite，可以管理College
public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    //重写add
    @Override
    protected void add(OrganizationComponent organizationComponent){
        organizationComponents.add(organizationComponent);
    }

    //重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponents.remove(organizationComponent);
    }


    //print方法，就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("------------------"+getName()+"------------------");
        for(OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }
}
