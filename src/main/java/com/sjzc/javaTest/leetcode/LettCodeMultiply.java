package com.sjzc.javaTest.leetcode;


/**
 * @author zhaochong
 * @Description 不用乘法，实现乘法
 * @create: 2020/5/29 4:41 下午
 **/
public class LettCodeMultiply {

    public int multiply(int a, int b) {
        if (b == 1) {
            return a;
        }
        if (b % 2 == 1) {
            return multiply(a << 1, b >> 1) + a;
        }
        return multiply(a << 1, b >> 1);
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        LettCodeMultiply letCode = new LettCodeMultiply();
        int multiply = letCode.multiply(a, b);
        System.out.println(multiply);
    }
}
