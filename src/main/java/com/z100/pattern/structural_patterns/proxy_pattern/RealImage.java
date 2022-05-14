package com.z100.pattern.structural_patterns.proxy_pattern;

/**
 * @author Z100
 * @create 2022-05-14 14:42
 * @desc
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
