package com.z100.pattern.behavioral_patterns.chain_of_responsibility_pattern;

/**
 * @author Z100
 * @create 2022-05-11 23:34
 * @desc
 **/
public class ChainPatternDemo {

    /**
     * 职责链对象
     * @return
     */
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        /**
         * 责任链的逻辑，各个处理器的顺序
         */
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        /**
         * 获得职责链对象
         */
        AbstractLogger loggerChain = getChainOfLoggers();

        /**
         * client直接发送请求给责任链对象，模拟3次
         */
        System.out.println("first request:");
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        System.out.println("second request:");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        System.out.println("third request:");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
