package com.z100.pattern.singleton_pattern.hungry_pattern;

/**
 * @author Z100
 * @create 2022-05-07 23:14
 * @desc double-checked locking 双校验/双重检查锁机制
 **/

/**
 * 是否 Lazy 初始化：否
 *
 * 是否多线程安全：是
 *
 * 实现难度：易
 *
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 *
 * 它基于 classloader 机制避免了多线程的同步问题，
 * 不过，instance 在类装载时就实例化，
 * 虽然 导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
 * 但是 不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化 instance 显然没有达到 lazy loading 的效果。
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
