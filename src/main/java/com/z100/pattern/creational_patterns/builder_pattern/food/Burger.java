package com.z100.pattern.creational_patterns.builder_pattern.food;

import com.z100.pattern.creational_patterns.builder_pattern.FoodItem;
import com.z100.pattern.creational_patterns.builder_pattern.packing.Packing;
import com.z100.pattern.creational_patterns.builder_pattern.packing.Wrapper;

/**
 * @author Z100
 * @create 2022-05-13 6:52
 * @desc
 **/
public abstract class Burger implements FoodItem {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
