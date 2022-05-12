package com.z100.pattern.creational_patterns.builder_pattern.food;

/**
 * @author Z100
 * @create 2022-05-13 6:56
 * @desc
 **/
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}
