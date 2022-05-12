package com.z100.pattern.creational_patterns.singleton_pattern.lazy_pattern.multithreading_unsafe;

/**
 * @author Z100
 * @create 2022-05-07 22:42
 * @desc demo test 多线程不安全测试
 * 不安全情况不常出现，一般出现一个"错误"
 **/
public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("多线程 unsafe: 懒汉式：");
        Thread[] threads = new Thread[50];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
