package com.z100.pattern.creational_patterns.prototype_pattern;

/**
 * @author Z100
 * @create 2022-05-15 15:23
 * @desc
 **/
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
