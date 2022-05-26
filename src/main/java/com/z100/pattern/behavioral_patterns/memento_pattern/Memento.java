package com.z100.pattern.behavioral_patterns.memento_pattern;

/**
 * @author Z100
 * @create 2022-05-26 13:24
 * @desc memento
 **/
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
