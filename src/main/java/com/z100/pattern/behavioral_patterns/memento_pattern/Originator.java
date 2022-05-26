package com.z100.pattern.behavioral_patterns.memento_pattern;

/**
 * @author Z100
 * @create 2022-05-26 13:25
 * @desc originator
 **/
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
