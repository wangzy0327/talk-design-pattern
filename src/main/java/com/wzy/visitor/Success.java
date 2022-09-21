package com.wzy.visitor;

public class Success extends Action{
    @Override
    void evaluateMan() {
        System.out.println("男歌手唱的不错！");
    }

    @Override
    void evaluateWoman() {
        System.out.println("女歌手唱的不错！");
    }
}
