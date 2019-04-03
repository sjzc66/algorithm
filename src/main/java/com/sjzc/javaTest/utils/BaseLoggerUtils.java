package com.sjzc.javaTest.utils;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 10:44 2019/4/3
 */
public abstract class BaseLoggerUtils {

    private static String systemId;

    public static void setSystemId(String sonSystemId) {
        systemId = sonSystemId;
    }

    public static String getSystemId() {
        return systemId;
    }

    public static void printSystemId() {
        System.out.println(getSystemId());
    }
}
