package com.z100.pattern.structural_patterns.proxy_pattern;

/**
 * @author Z100
 * @create 2022-05-14 14:42
 * @desc
 **/
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
