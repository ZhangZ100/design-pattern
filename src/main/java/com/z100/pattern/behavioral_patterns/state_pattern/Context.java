package com.z100.pattern.behavioral_patterns.state_pattern;

/**
 * @author Z100
 * @create 2022-05-28 17:46
 * @desc context
 **/
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
