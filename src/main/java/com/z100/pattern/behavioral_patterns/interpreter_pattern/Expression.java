package com.z100.pattern.behavioral_patterns.interpreter_pattern;

/**
 * @author Z100
 * @create 2022-05-23 13:56
 * @desc expression 表达式
 **/
public interface Expression {
    public boolean interpret(String context);
}
