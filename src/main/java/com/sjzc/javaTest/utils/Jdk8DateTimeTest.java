package com.sjzc.javaTest.utils;

import java.time.LocalDate;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 9:15 2019/3/16
 */
public class Jdk8DateTimeTest {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date : " + today);
    }
}
