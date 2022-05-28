package com.z100.pattern.behavioral_patterns.state_pattern;

/**
 * @author Z100
 * @create 2022-05-28 17:47
 * @desc stopState
 **/
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
