package com.z100.pattern.behavioral_patterns.template_method_pattern;

/**
 * @author Z100
 * @create 2022-05-30 12:44
 * @desc demo
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
