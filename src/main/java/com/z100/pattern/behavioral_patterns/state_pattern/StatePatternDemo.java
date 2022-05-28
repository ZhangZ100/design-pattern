package com.z100.pattern.behavioral_patterns.state_pattern;

/**
 * @author Z100
 * @create 2022-05-28 17:47
 * @desc demo
 **/
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
