package com.wzy.facade;

public class Popcore {
    private static final Popcore instance = new Popcore();

    private Popcore(){}

    public static Popcore getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Popcorn on ");
    }

    public void off(){
        System.out.println(" Popcorn off ");
    }

    public void pop(){
        System.out.println(" Popcorn is poping ");
    }


}
