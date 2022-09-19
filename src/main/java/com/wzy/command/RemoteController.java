package com.wzy.command;

public class RemoteController {
    //开闭按钮的命令数组
    Command[] onCommands;

    //执行撤销的命令
    Command undoCommand;
    //构造器，完成对按钮的初始化
    //标志当下是开还是关 1是开，0是关
    int flag;


    public RemoteController() {
        this.onCommands = new Command[5];

        for(int i = 0;i < 5;i++){
            onCommands[i] = new NoCommand();
        }

    }

    //给我们的按钮设置需要的命令
    public void setCommand(int number,Command command){
        onCommands[number] = command;
    }

    //按下开按钮
    public void onButtonWasPushed(int no){
        //找到按下的开的按钮，并调用对应方法
        onCommands[no].execute();
        undoCommand = onCommands[no];
        flag = 1;
    }

    //按下关闭按钮
    public void offButtonWasPushed(int no){
        //找到按下的按钮，并调用对应方法
        onCommands[no].undo();
        undoCommand = onCommands[no];
        flag = 0;
    }

    //按下撤销按钮
    public void undoButtonWasPushed(){
        if(flag == 0)
            undoCommand.execute();
        else
            undoCommand.undo();
    }
}
