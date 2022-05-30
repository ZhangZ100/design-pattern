package com.z100.pattern.behavioral_patterns.template_method_pattern;

/**
 * @author Z100
 * @create 2022-05-30 12:42
 * @desc game
 **/
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
