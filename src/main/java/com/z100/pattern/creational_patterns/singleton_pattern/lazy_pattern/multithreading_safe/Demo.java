package com.z100.pattern.creational_patterns.singleton_pattern.lazy_pattern.multithreading_safe;

/**
 * @author Z100
 * @create 2022-05-07 23:03
 * @desc
 **/
public class Demo {
    public static void main(String[] args) {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < threads.length; i++) {
            threads[i]=new MyThread();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
