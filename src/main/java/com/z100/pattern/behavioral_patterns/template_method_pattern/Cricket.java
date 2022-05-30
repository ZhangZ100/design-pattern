package com.z100.pattern.behavioral_patterns.template_method_pattern;

/**
 * @author Z100
 * @create 2022-05-30 12:42
 * @desc
 **/
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
