package com.z100.pattern.creational_patterns.factory_pattern.simple_factory;

import com.z100.pattern.creational_patterns.factory_pattern.simple_factory.shape.Circle;
import com.z100.pattern.creational_patterns.factory_pattern.simple_factory.shape.Rectangle;
import com.z100.pattern.creational_patterns.factory_pattern.simple_factory.shape.Shape;
import com.z100.pattern.creational_patterns.factory_pattern.simple_factory.shape.Square;

/**
 * @author Z100
 * @create 2022-05-12 22:06
 * @desc
 **/
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
