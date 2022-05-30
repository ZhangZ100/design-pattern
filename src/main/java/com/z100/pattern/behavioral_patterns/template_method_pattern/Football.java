package com.z100.pattern.behavioral_patterns.template_method_pattern;

/**
 * @author Z100
 * @create 2022-05-30 12:43
 * @desc
 **/
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
