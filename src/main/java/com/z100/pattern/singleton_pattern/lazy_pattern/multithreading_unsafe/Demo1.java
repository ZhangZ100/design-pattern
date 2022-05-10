package com.z100.pattern.singleton_pattern.lazy_pattern.multithreading_unsafe;

/**
 * @author Z100
 * @create 2022-05-07 22:36
 * @desc demo test 单线程安全测试
 **/
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("懒汉式：单线程模式：");
        for (int i = 0; i < 10; i++) {
            Singleton instance = Singleton.getInstance();
            System.out.println(instance);
        }
    }
}
