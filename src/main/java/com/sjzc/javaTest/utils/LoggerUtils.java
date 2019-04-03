package com.sjzc.javaTest.utils;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 10:44 2019/4/3
 */
public class LoggerUtils extends BaseLoggerUtils{
    private static String systemId = "33";

    public static void printSystemId() {
        System.out.println("静态方法" + systemId);
    }

    public LoggerUtils() {
        System.out.println("构造函数");
    }

    static{
        BaseLoggerUtils.setSystemId(systemId);
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        LoggerUtils.printSystemId();
    }
}
