package com.wzy.visitor;

public class Woman extends Singer{
    @Override
    void accept(Action action) {
        action.evaluateMan();
    }
}
