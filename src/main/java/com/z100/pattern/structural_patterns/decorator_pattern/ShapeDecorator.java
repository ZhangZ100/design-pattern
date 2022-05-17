package com.z100.pattern.structural_patterns.decorator_pattern;

/**
 * @author Z100
 * @create 2022-05-17 13:01
 * @desc
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
