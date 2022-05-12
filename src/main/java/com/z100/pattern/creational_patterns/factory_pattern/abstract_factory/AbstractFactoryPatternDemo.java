package com.z100.pattern.creational_patterns.factory_pattern.abstract_factory;

import com.z100.pattern.creational_patterns.factory_pattern.abstract_factory.computer.Computer;
import com.z100.pattern.creational_patterns.factory_pattern.abstract_factory.factory.AppleFactory;
import com.z100.pattern.creational_patterns.factory_pattern.abstract_factory.factory.DellFactory;
import com.z100.pattern.creational_patterns.factory_pattern.abstract_factory.mouse.Mouse;

/**
 * @author Z100
 * @create 2022-05-12 22:32
 * @desc
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        DellFactory dellFactory = new DellFactory();

        Computer appleComputer = appleFactory.getComputer();
        Mouse appleMouse = appleFactory.getMouse();
        appleComputer.computerMethod();
        appleMouse.mouseMethod();

        Computer dellComputer = dellFactory.getComputer();
        Mouse dellMouse = dellFactory.getMouse();
        dellComputer.computerMethod();
        dellMouse.mouseMethod();
    }
}
