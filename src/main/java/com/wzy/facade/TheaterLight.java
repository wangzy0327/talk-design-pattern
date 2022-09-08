package com.wzy.facade;

//影院灯光
public class TheaterLight {
    private static final TheaterLight instance = new TheaterLight();

    private TheaterLight(){}

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" TheaterLight on ");
    }

    public void off(){
        System.out.println(" TheaterLight off ");
    }

    public void up(){
        System.out.println(" TheaterLight up ");
    }

    public void down(){
        System.out.println(" TheaterLight down ");
    }
}
