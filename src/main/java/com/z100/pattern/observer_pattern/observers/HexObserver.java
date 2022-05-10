package com.z100.pattern.observer_pattern.observers;

import com.z100.pattern.observer_pattern.Observer;
import com.z100.pattern.observer_pattern.Subject;

/**
 * @author Z100
 * @create 2022-05-10 23:32
 * @desc
 **/
public class HexObserver extends Observer {

    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
