package com.z100.pattern.behavioral_patterns.state_pattern;

/**
 * @author Z100
 * @create 2022-05-28 17:46
 * @desc startState
 **/
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
