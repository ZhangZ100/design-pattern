package com.z100.pattern.behavioral_patterns.visitor_pattern;

/**
 * @author Z100
 * @create 2022-05-31 9:06
 * @desc mouse
 **/
public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
