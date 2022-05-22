package com.z100.pattern.behavioral_patterns.command_pattern;

/**
 * @author Z100
 * @create 2022-05-22 13:52
 * @desc stock
 **/
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + " Quantity: "
                + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + " Quantity: "
                + quantity + " ] sold");
    }
}
