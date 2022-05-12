package com.z100.pattern.creational_patterns.builder_pattern.food;

import com.z100.pattern.creational_patterns.builder_pattern.FoodItem;
import com.z100.pattern.creational_patterns.builder_pattern.packing.Bottle;
import com.z100.pattern.creational_patterns.builder_pattern.packing.Packing;

/**
 * @author Z100
 * @create 2022-05-13 6:53
 * @desc
 **/
public abstract class ColdDrink implements FoodItem {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
