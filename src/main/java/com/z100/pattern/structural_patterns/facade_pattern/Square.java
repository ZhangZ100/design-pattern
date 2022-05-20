package com.z100.pattern.structural_patterns.facade_pattern;

/**
 * @author Z100
 * @create 2022-05-20 14:18
 * @desc square
 **/
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
