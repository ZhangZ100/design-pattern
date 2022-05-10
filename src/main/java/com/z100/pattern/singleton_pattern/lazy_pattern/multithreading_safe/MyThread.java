package com.z100.pattern.singleton_pattern.lazy_pattern.multithreading_safe;


/**
 * @author Z100
 * @create 2022-05-07 22:46
 * @desc
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance+"    "+Thread.currentThread().getName());
    }
}
