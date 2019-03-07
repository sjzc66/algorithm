package com.sjzc.javaTest;

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mina
 * @Description: 字符串插值工具
 * @Date: Created in 15:35 2019/3/7
 */
public class LogInterpolator {

    public static void main(String[] args) {
//        LogInterpolator.interpolate2("用户支付失败,交易号:{2},用户:{0},失败原因:{1}","1234567890","xxxx异常",111);
        LogInterpolator.interpolate3("a{0}c{1}e","b","d");

    }

    public static String interpolate0(String text,String ...strings) {
        for (int i = 0; i < strings.length; i++) {
            text = text.replace("{" + i + "}", strings[i]);
        }
        System.out.println(text);
        return text;
    }

    public static String interpolate1(String text,Object ...strings) {
        for (int i = 0; i < strings.length; i++) {
            text = text.replace("{" + i + "}", strings[i].toString());
        }
        System.out.println(text);
        return text;
    }

    public static String interpolate2(String text,Object ... strings) {
        String format = MessageFormat.format(text, strings);
        System.out.println(format);
        return text;
    }

    public static String interpolate3(String text, Object... args) {
        StringFUtil stringFUtil = new StringFUtil(text);
        long st = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            String rtn = stringFUtil.format(args);
        }
        long et = System.currentTimeMillis();
        System.out.println( et - st);
        return null;
    }

    private static String fillStringByArgs(String str,String[] arr){
        Matcher m = Pattern.compile("\\{(\\d)\\}").matcher(str);
        while(m.find()){
            str=str.replace(m.group(),arr[Integer.parseInt(m.group(1))]);
        }
        return str;
    }

}
