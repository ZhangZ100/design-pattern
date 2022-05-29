package com.z100.pattern.behavioral_patterns.strategy_pattern;

/**
 * @author Z100
 * @create 2022-05-29 15:12
 * @desc context
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
