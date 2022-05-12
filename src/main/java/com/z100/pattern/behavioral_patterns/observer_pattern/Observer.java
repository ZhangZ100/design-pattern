package com.z100.pattern.behavioral_patterns.observer_pattern;

/**
 * @author Z100
 * @create 2022-05-10 23:27
 * @desc 抽象观察者类
 **/
public abstract class Observer {
    /**
     * protected: 当前类 ，当前包，当前类的子类可以访问
     */
    protected Subject subject;

    /**
     * 观察者 随subject(主题，被观察者，观察主题)state改变而进行改变的逻辑
     * 由 subject 广播通知时调用
     */
    public abstract void update();
}
