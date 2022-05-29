package com.z100.pattern.behavioral_patterns.strategy_pattern;

/**
 * @author Z100
 * @create 2022-05-29 15:10
 * @desc add
 **/
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
