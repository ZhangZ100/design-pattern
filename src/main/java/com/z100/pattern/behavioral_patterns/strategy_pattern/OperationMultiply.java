package com.z100.pattern.behavioral_patterns.strategy_pattern;

/**
 * @author Z100
 * @create 2022-05-29 15:11
 * @desc
 **/
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
