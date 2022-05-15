package com.z100.pattern.creational_patterns.prototype_pattern;

/**
 * @author Z100
 * @create 2022-05-15 15:23
 * @desc
 **/
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
