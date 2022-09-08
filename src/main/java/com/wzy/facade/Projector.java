package com.wzy.facade;

//投影仪
public class Projector {

    private static final Projector instance = new Projector();

    private Projector(){}

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Projector on ");
    }

    public void off(){
        System.out.println(" Projector off ");
    }

    public void focus(){
        System.out.println(" Projector is focusing ");
    }

}
