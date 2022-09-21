package com.wzy.visitor;

public class Wait extends Action{
    @Override
    void evaluateMan() {
        System.out.println("男歌手唱的待定！");
    }

    @Override
    void evaluateWoman() {
        System.out.println("女歌手唱的待定！");
    }
}
