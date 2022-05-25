package com.z100.pattern.behavioral_patterns.mediator_pattern;

/**
 * @author Z100
 * @create 2022-05-25 13:13
 * @desc chat room
 **/
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
