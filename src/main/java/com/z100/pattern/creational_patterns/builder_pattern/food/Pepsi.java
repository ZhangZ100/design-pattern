package com.z100.pattern.creational_patterns.builder_pattern.food;

/**
 * @author Z100
 * @create 2022-05-13 6:56
 * @desc
 **/
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
