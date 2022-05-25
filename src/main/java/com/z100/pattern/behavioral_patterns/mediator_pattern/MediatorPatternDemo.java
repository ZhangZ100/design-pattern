package com.z100.pattern.behavioral_patterns.mediator_pattern;

/**
 * @author Z100
 * @create 2022-05-25 13:14
 * @desc demo
 **/
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
