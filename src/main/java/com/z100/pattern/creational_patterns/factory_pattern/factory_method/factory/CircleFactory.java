package com.z100.pattern.creational_patterns.factory_pattern.factory_method.factory;

import com.z100.pattern.creational_patterns.factory_pattern.factory_method.shape.Circle;
import com.z100.pattern.creational_patterns.factory_pattern.factory_method.shape.Shape;

/**
 * @author Z100
 * @create 2022-05-12 22:09
 * @desc
 **/
public class CircleFactory implements Factory {
    public Shape buildShape() {
        return new Circle();
    }
}
