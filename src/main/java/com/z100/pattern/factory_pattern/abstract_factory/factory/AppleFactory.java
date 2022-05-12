package com.z100.pattern.factory_pattern.abstract_factory.factory;

import com.z100.pattern.factory_pattern.abstract_factory.computer.AppleComputer;
import com.z100.pattern.factory_pattern.abstract_factory.computer.Computer;
import com.z100.pattern.factory_pattern.abstract_factory.mouse.AppleMouse;
import com.z100.pattern.factory_pattern.abstract_factory.mouse.Mouse;

/**
 * @author Z100
 * @create 2022-05-12 22:24
 * @desc
 **/
public class AppleFactory implements Factory {

    public Computer getComputer() {
        return new AppleComputer();
    }

    public Mouse getMouse() {
        return new AppleMouse();
    }
}
