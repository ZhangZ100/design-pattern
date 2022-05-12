package com.z100.pattern.factory_pattern.factory_method.factory;

import com.z100.pattern.factory_pattern.factory_method.shape.Shape;
import com.z100.pattern.factory_pattern.factory_method.shape.Square;

/**
 * @author Z100
 * @create 2022-05-12 22:09
 * @desc
 **/
public class SquareFactory implements Factory {
    public Shape buildShape() {
        return new Square();
    }
}
