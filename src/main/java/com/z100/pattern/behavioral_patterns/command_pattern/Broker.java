package com.z100.pattern.behavioral_patterns.command_pattern;

/**
 * @author Z100
 * @create 2022-05-22 13:55
 * @desc broker
 **/
import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
