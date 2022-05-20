package com.z100.pattern.structural_patterns.facade_pattern;

/**
 * @author Z100
 * @create 2022-05-20 14:19
 * @desc facade pattern
 **/
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
