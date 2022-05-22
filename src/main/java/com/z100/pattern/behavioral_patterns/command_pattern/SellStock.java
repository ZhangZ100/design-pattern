package com.z100.pattern.behavioral_patterns.command_pattern;

/**
 * @author Z100
 * @create 2022-05-22 13:55
 * @desc sell stock
 **/
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
