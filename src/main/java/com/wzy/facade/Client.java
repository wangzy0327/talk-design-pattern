package com.wzy.facade;

public class Client {
    public static void main(String[] args) {
        //直接调用很麻烦，这里做个外观类

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        //1
        homeTheaterFacade.ready();
        System.out.println("--------------------------");
        //2
        homeTheaterFacade.play();
        System.out.println("--------------------------");
        //3
        homeTheaterFacade.pause();
        System.out.println("--------------------------");
        //4
        homeTheaterFacade.end();
    }
}
