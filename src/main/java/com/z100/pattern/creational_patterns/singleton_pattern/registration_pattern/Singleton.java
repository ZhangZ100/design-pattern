package com.z100.pattern.creational_patterns.singleton_pattern.registration_pattern;

/**
 * @author Z100
 * @create 2022-05-08 10:11
 * @desc 注册式，静态内部类； lazy-loading，静态内部类只有在调用时才会加载 (即getInstance())
 **/
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
