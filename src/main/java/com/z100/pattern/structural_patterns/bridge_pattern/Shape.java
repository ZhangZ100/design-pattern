package com.z100.pattern.structural_patterns.bridge_pattern;

/**
 * @author Z100
 * @create 2022-05-18 10:41
 * @desc shape
 **/
public abstract class Shape {
    /**
     * 依赖drawAPI
     * 实现抽象和实现的分离：
     *  即 抽象drawAPI 与 Shape实现类 的分离；
     *  抽象draw()方法，与不同的桥接实现类分离
     * 可以使用相同的抽象类方法但是不同的桥接实现类，来画出不同颜色的圆
     */
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
