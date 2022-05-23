package com.z100.pattern.behavioral_patterns.interpreter_pattern;

/**
 * @author Z100
 * @create 2022-05-23 13:57
 * @desc terminal expression 终端表达式
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
