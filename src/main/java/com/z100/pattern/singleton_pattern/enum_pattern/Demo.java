package com.z100.pattern.singleton_pattern.enum_pattern;

/**
 * @author Z100
 * @create 2022-05-07 23:03
 * @desc
 **/
public class Demo {
    public static void main(String[] args) {
        Thread[] threads = new Thread[18];
        for (int i = 0; i < threads.length; i++) {
            threads[i]=new MyThread();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
