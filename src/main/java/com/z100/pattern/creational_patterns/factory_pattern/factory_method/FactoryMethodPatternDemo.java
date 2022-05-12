package com.z100.pattern.creational_patterns.factory_pattern.factory_method;

import com.z100.pattern.creational_patterns.factory_pattern.factory_method.factory.CircleFactory;
import com.z100.pattern.creational_patterns.factory_pattern.factory_method.factory.RectangleFactory;
import com.z100.pattern.creational_patterns.factory_pattern.factory_method.shape.Shape;
import com.z100.pattern.creational_patterns.factory_pattern.factory_method.factory.SquareFactory;

/**
 * @author Z100
 * @create 2022-05-12 22:11
 * @desc
 **/
public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        Shape shape1 = new CircleFactory().buildShape();
        Shape shape2 = new SquareFactory().buildShape();
        Shape shape3 = new RectangleFactory().buildShape();

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
