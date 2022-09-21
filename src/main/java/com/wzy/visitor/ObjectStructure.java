package com.wzy.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    List<Singer> singers = new LinkedList<>();

    void add(Singer singer){
        singers.add(singer);
    }

    void remove(Singer singer){
        singers.remove(singer);
    }

    void evaluate(Action action){
        for(Singer singer:singers){
            singer.accept(action);
        }
    }


}
