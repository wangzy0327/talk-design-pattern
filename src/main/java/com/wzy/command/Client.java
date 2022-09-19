package com.wzy.command;

public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯的操作

        //创建电灯的对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给我们的遥控器设置命令，比如 no = 0是电灯的开关操作
        remoteController.setCommand(0,lightOnCommand);

        System.out.println("--------按下灯的开的按钮---------");
        remoteController.onButtonWasPushed(0);
        System.out.println("--------按下灯的关的按钮---------");
        remoteController.offButtonWasPushed(0);
        System.out.println("--------按下灯的撤销按钮---------");
        remoteController.undoButtonWasPushed();

        /**
         *
         * --------按下灯的开的按钮---------
         * 电灯打开了...
         * --------按下灯的关的按钮---------
         * 电灯关闭了...
         * --------按下灯的撤销按钮---------
         * 电灯打开了...
         *
         *
         */

    }
}
