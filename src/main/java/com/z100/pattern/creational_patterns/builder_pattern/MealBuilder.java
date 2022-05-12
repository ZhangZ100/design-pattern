package com.z100.pattern.creational_patterns.builder_pattern;

import com.z100.pattern.creational_patterns.builder_pattern.food.ChickenBurger;
import com.z100.pattern.creational_patterns.builder_pattern.food.Coke;
import com.z100.pattern.creational_patterns.builder_pattern.food.Pepsi;
import com.z100.pattern.creational_patterns.builder_pattern.food.VegBurger;

/**
 * @author Z100
 * @create 2022-05-13 7:01
 * @desc
 **/
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addFoodItem(new VegBurger());
        meal.addFoodItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addFoodItem(new ChickenBurger());
        meal.addFoodItem(new Pepsi());
        return meal;
    }
}
