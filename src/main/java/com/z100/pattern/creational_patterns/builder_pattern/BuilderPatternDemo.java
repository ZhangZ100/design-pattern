package com.z100.pattern.creational_patterns.builder_pattern;

/**
 * @author Z100
 * @create 2022-05-13 7:02
 * @desc
 **/
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showFoodItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showFoodItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
