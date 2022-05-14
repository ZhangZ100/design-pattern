package com.z100.pattern.structural_patterns.proxy_pattern;

import com.z100.util.TUtil;

/**
 * @author Z100
 * @create 2022-05-14 14:43
 * @desc
 **/
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
        TUtil.method();
    }
}
