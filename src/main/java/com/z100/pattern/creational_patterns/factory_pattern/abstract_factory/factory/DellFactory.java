package com.z100.pattern.creational_patterns.factory_pattern.abstract_factory.factory;

import com.z100.pattern.creational_patterns.factory_pattern.abstract_factory.computer.Computer;
import com.z100.pattern.creational_patterns.factory_pattern.abstract_factory.computer.DellComputer;
import com.z100.pattern.creational_patterns.factory_pattern.abstract_factory.mouse.DellMouse;
import com.z100.pattern.creational_patterns.factory_pattern.abstract_factory.mouse.Mouse;

/**
 * @author Z100
 * @create 2022-05-12 22:32
 * @desc
 **/
public class DellFactory implements Factory {
    public Computer getComputer() {
        return new DellComputer();
    }

    public Mouse getMouse() {
        return new DellMouse();
    }
}
