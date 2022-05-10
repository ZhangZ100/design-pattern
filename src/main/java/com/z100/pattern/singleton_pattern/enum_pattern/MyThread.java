package com.z100.pattern.singleton_pattern.enum_pattern;




/**
 * @author Z100
 * @create 2022-05-07 22:46
 * @desc
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        Singleton instance = Singleton.INSTANCE;
        System.out.println("hash: "+instance.hashCode()+"    "+Thread.currentThread().getName());
    }
}
