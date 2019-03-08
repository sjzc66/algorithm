package com.sjzc.javaTest;

import java.text.MessageFormat;

/**
 * @author mina
 * @Description: 字符串插值工具
 * @Date: Created in 15:35 2019/3/7
 */
public class LogInterpolator {

    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        String string = LogInterpolator.interpolate3("用户支付失败,交易号:{2},用户:{0},失败原因:{1}", "1234\"哈\"567890", "xxxx异常", 111, 222);
        System.out.println(string);
        long et = System.currentTimeMillis();

        System.out.println("数组实现单个执行时间："+ (et - st));

        st = System.currentTimeMillis();
        string = LogInterpolator.interpolate4("用户支付失败,交易号:{2},用户:{0},失败原因:{1}", "1234567890", "xxxx异常", 111, 222);
        System.out.println(string);
        et = System.currentTimeMillis();

        System.out.println("MessageFormat实现单个执行时间："+ (et - st));

        System.out.println("=====================对比测试===========================");

        st = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            LogInterpolator.interpolate3("用户支付失败,交易号:{2},用户:{0},失败原因:{1}", "1234567890", "xxxx异常", 111, 222);
        }
        et = System.currentTimeMillis();

        System.out.println("数组实现100000个执行时间："+ (et - st));

        st = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            LogInterpolator.interpolate4("用户支付失败,交易号:{2},用户:{0},失败原因:{1}", "1234567890", "xxxx异常", 111, 222);
        }
        et = System.currentTimeMillis();

        System.out.println("MessageFormat实现100000个执行时间："+ (et - st));
    }

    //**replace实现**//
    public static String interpolate1(String text,String ...strings) {
        for (int i = 0; i < strings.length; i++) {
            text = text.replace("{" + i + "}", strings[i]);
        }
        String rtn = String.format(text, strings);
        System.out.println(rtn);
        return rtn;
    }

    //**replace实现**//
    public static String interpolate2(String text,Object ...strings) {
        for (int i = 0; i < strings.length; i++) {
            text = text.replace("{" + i + "}", strings[i].toString());
        }
        String rtn = String.format(text, strings);
        System.out.println(rtn);
        return rtn;
    }

    //**数组实现**//
    public static String interpolate3(String text, Object... args) {
        LogFormat logFormat = new LogFormat(text);
        String rtn = logFormat.format(args);
        return rtn;
    }

    //**MessageFormat实现**//
    public static String interpolate4(String text, Object... args) {
        String rtn = MessageFormat.format(text, args);
        return rtn;
    }

}
