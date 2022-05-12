package com.z100.pattern.behavioral_patterns.chain_of_responsibility_pattern;

/**
 * @author Z100
 * @create 2022-05-11 23:29
 * @desc 责任链接收者：具体接收者
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
