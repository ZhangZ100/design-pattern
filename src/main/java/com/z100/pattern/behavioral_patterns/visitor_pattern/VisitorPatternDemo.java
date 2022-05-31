package com.z100.pattern.behavioral_patterns.visitor_pattern;

/**
 * @author Z100
 * @create 2022-05-31 9:10
 * @desc demo
 **/
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        System.out.println();

        ComputerPart mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());

    }
}
