package com.z100.pattern.creational_patterns.prototype_pattern;

/**
 * @author Z100
 * @create 2022-05-15 15:24
 * @desc
 **/
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
