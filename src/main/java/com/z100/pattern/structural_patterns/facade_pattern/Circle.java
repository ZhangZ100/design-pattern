package com.z100.pattern.structural_patterns.facade_pattern;

/**
 * @author Z100
 * @create 2022-05-20 14:18
 * @desc circle
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
