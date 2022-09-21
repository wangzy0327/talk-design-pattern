package com.wzy.visitor;

public class Man extends Singer{
    @Override
    void accept(Action action) {
        action.evaluateMan();
    }
}
