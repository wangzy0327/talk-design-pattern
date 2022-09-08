package com.wzy.facade;

public class HomeTheaterFacade {
    //定义各个子系统对象
    private DVDPlayer dvdPlayer;
    private Popcore popcore;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcore = Popcore.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    //操作分为四步
    public void ready(){
        popcore.on();
        popcore.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.down();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcore.off();
        theaterLight.on();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();

    }
}
