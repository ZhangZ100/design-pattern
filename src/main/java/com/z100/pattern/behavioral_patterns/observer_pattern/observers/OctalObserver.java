package com.z100.pattern.behavioral_patterns.observer_pattern.observers;

import com.z100.pattern.behavioral_patterns.observer_pattern.Observer;
import com.z100.pattern.behavioral_patterns.observer_pattern.Subject;

/**
 * @author Z100
 * @create 2022-05-10 23:30
 * @desc
 **/
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
