package com.z100.pattern.behavioral_patterns.visitor_pattern;

/**
 * @author Z100
 * @create 2022-05-31 9:04
 * @desc part
 **/
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
