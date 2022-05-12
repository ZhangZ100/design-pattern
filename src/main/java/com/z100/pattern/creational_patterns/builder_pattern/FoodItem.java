package com.z100.pattern.creational_patterns.builder_pattern;

import com.z100.pattern.creational_patterns.builder_pattern.packing.Packing;

/**
 * @author Z100
 * @create 2022-05-13 6:49
 * @desc
 **/
public interface FoodItem {
    public String name();
    public Packing packing();
    public float price();
}
