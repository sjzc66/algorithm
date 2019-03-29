package com.sjzc.javaTest.utils;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 9:15 2019/3/16
 */
public class LombokTest {

    public static void main(String[] args) {
        LombokDemo s = LombokDemo.builder().id(1).name("张三").build();
        System.out.println(s.toString());
    }
}
