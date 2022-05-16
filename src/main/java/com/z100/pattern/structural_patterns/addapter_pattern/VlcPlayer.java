package com.z100.pattern.structural_patterns.addapter_pattern;

/**
 * @author Z100
 * @create 2022-05-16 15:21
 * @desc
 **/
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }


    public void playMp4(String fileName) {
        //什么也不做
    }
}
