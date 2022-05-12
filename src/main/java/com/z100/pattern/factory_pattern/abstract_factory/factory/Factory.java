package com.z100.pattern.factory_pattern.abstract_factory.factory;
import com.z100.pattern.factory_pattern.abstract_factory.computer.Computer;
import com.z100.pattern.factory_pattern.abstract_factory.mouse.Mouse;

/**
 * @author Z100
 * @create 2022-05-12 22:19
 * @desc
 **/
public interface Factory {
    Computer getComputer();
    Mouse getMouse();
}
