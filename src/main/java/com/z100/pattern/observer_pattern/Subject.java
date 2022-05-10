package com.z100.pattern.observer_pattern;

/**
 * @author Z100
 * @create 2022-05-10 23:27
 * @desc subject, 主题, 被观察者
 **/
import java.util.ArrayList;
import java.util.List;

public class Subject {

    /**
     * 保存observers
     */
    private List<Observer> observers
            = new ArrayList<Observer>();

    /**
     * 被观察者自身的state，改变后通知observers
     */
    private int state;

    public int getState() {
        return state;
    }

    /**
     * 提供对外接口，改变subject的state
     * @param state
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 观察者调用 成员变量subject.attach(this),将自己绑定具体的 被观察者 以得到通知
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 广播通知
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
