package com.z100.pattern.observer_pattern.observers;

import com.z100.pattern.observer_pattern.Observer;
import com.z100.pattern.observer_pattern.Subject;

/**
 * @author Z100
 * @create 2022-05-10 23:28
 * @desc 具体观察者
 **/
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
