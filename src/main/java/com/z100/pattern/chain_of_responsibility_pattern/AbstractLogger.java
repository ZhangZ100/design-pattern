package com.z100.pattern.chain_of_responsibility_pattern;

/**
 * @author Z100
 * @create 2022-05-11 23:28
 * @desc 责任链模式中接收者的抽象
 **/
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 当前接收者 尝试请求 并传递给下一个接受者
     *
     * @param level
     * @param message
     */
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 当前接收者处理逻辑
     *
     * @param message
     */
    abstract protected void write(String message);

}
