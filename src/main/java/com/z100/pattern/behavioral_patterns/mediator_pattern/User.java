package com.z100.pattern.behavioral_patterns.mediator_pattern;

/**
 * @author Z100
 * @create 2022-05-25 13:14
 * @desc user
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
