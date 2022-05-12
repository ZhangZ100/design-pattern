package com.z100.pattern.creational_patterns.builder_pattern.food;

/**
 * @author Z100
 * @create 2022-05-13 6:55
 * @desc
 **/
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Veg Burger";
    }
}
