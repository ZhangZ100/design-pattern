package com.z100.pattern.behavioral_patterns.chain_of_responsibility_pattern;

/**
 * @author Z100
 * @create 2022-05-11 23:30
 * @desc
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
