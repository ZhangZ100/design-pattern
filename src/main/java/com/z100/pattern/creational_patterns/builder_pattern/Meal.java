package com.z100.pattern.creational_patterns.builder_pattern;

/**
 * @author Z100
 * @create 2022-05-13 6:57
 * @desc
 **/
import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<FoodItem> FoodItems = new ArrayList<FoodItem>();

    public void addFoodItem(FoodItem FoodItem){
        FoodItems.add(FoodItem);
    }

    public float getCost(){
        float cost = 0.0f;
        for (FoodItem FoodItem : FoodItems) {
            cost += FoodItem.price();
        }
        return cost;
    }

    public void showFoodItems(){
        for (FoodItem FoodItem : FoodItems) {
            System.out.print("FoodItem : "+FoodItem.name());
            System.out.print(", Packing : "+FoodItem.packing().pack());
            System.out.println(", Price : "+FoodItem.price());
        }
    }
}
