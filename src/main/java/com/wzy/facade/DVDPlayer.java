package com.wzy.facade;

public class DVDPlayer {
    //这里使用懒汉式
    private static final DVDPlayer instance = new DVDPlayer();

    private DVDPlayer(){}

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" DVD on ");
    }

    public void off(){
        System.out.println(" DVD off ");
    }

    public void play(){
        System.out.println(" DVD is playing ");
    }

    public void pause(){
        System.out.println(" DVD pause ");
    }

}
