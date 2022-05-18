package com.z100.pattern.structural_patterns.bridge_pattern;

/**
 * @author Z100
 * @create 2022-05-18 10:42
 * @desc
 **/
public class RedCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
