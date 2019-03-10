package com.sjzc.javaTest;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 8:44 2019/3/10
 */
public class StringTest {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 10000; i++) {
            s += i;
        }
        long et = System.currentTimeMillis();
        System.out.println("执行时间：" + (et - st));


        st = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s = "1" + i + "3";
            s.intern();
        }
        et = System.currentTimeMillis();
        System.out.println("执行时间：" + (et - st));


        st = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        et = System.currentTimeMillis();
        System.out.println("执行时间：" + (et - st));
    }
}
