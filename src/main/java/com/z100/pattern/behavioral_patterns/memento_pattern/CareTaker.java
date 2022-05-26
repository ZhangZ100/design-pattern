package com.z100.pattern.behavioral_patterns.memento_pattern;

/**
 * @author Z100
 * @create 2022-05-26 13:25
 * @desc careTaker
 **/
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento mementoState){
        mementoList.add(mementoState);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
