package com.z100.pattern.structural_patterns.facade_pattern;

/**
 * @author Z100
 * @create 2022-05-20 14:18
 * @desc
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
