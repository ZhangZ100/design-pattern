package com.z100.pattern.creational_patterns.factory_pattern.factory_method.factory;

import com.z100.pattern.creational_patterns.factory_pattern.factory_method.shape.Rectangle;
import com.z100.pattern.creational_patterns.factory_pattern.factory_method.shape.Shape;

/**
 * @author Z100
 * @create 2022-05-12 22:10
 * @desc
 **/
public class RectangleFactory implements Factory {
    public Shape buildShape() {
        return new Rectangle();
    }
}
