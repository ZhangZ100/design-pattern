package com.z100.pattern.structural_patterns.bridge_pattern;

/**
 * @author Z100
 * @create 2022-05-18 10:47
 * @desc circle
 **/
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
