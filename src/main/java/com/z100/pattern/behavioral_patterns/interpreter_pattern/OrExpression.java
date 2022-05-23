package com.z100.pattern.behavioral_patterns.interpreter_pattern;

/**
 * @author Z100
 * @create 2022-05-23 13:58
 * @desc or
 **/
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
