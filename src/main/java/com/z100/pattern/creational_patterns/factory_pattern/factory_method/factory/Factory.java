package com.z100.pattern.creational_patterns.factory_pattern.factory_method.factory;

import com.z100.pattern.creational_patterns.factory_pattern.factory_method.shape.Shape;

/**
 * @author Z100
 * @create 2022-05-12 22:08
 * @desc
 **/
public interface Factory {
    public Shape buildShape();
}
