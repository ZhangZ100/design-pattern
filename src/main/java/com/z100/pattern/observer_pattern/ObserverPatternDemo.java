package com.z100.pattern.observer_pattern;

import com.z100.pattern.observer_pattern.observers.BinaryObserver;
import com.z100.pattern.observer_pattern.observers.HexObserver;
import com.z100.pattern.observer_pattern.observers.OctalObserver;

/**
 * @author Z100
 * @create 2022-05-10 23:38
 * @desc
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
