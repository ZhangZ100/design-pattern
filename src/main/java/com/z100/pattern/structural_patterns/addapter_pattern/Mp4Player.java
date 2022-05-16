package com.z100.pattern.structural_patterns.addapter_pattern;

/**
 * @author Z100
 * @create 2022-05-16 15:22
 * @desc
 **/
public class Mp4Player implements AdvancedMediaPlayer {


    public void playVlc(String fileName) {
        //什么也不做
    }


    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
