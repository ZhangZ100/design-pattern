package com.z100.pattern.behavioral_patterns.visitor_pattern;




/**
 * @author Z100
 * @create 2022-05-31 9:04
 * @desc
 **/
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
