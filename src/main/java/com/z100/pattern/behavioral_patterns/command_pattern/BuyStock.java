package com.z100.pattern.behavioral_patterns.command_pattern;

/**
 * @author Z100
 * @create 2022-05-22 13:54
 * @desc buy stock
 **/
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
