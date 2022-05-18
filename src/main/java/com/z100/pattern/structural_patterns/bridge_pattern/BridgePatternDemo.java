package com.z100.pattern.structural_patterns.bridge_pattern;

/**
 * @author Z100
 * @create 2022-05-18 10:47
 * @desc
 **/
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
