package com.sjzc.javaTest;

/**
 * @author mina
 * @Description: 字符串插值工具
 * @Date: Created in 15:35 2019/3/7
 */
public class LogInterpolator {

    public static void main(String[] args) {
        //LogInterpolator.interpolate("{2},{0},{1}","mina","this is a test","hello");
        LogInterpolator.interpolate("用户支付失败,交易号:{2},用户:{0},失败原因:{1}","1234567890","xxxx异常",111,222);
    }

    public static String interpolate(String text,String ...strings) {
        for (int i = 0; i < strings.length; i++) {
            text = text.replace("{" + i + "}", strings[i]);
        }
        String rtn = String.format(text, strings);
        System.out.println(rtn);
        return rtn;
    }

    public static <T> String interpolate(String text,T ...strings) {
        for (int i = 0; i < strings.length; i++) {
            text = text.replace("{" + i + "}", strings[i].toString());
        }
        String rtn = String.format(text, strings);
        System.out.println(rtn);
        return rtn;
    }
}
