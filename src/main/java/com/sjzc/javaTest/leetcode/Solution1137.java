package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 泰波那契序列 Tn 定义如下： 
 * <p>
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *
 * <p>
 * Solution0160
 * @create: 2020-04-26 20:13
 **/
public class Solution1137 {

    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = a + b + c;
            a = b;
            b = c;
            c = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Solution1137.tribonacci(0));
        System.out.println(Solution1137.tribonacci(1));
        System.out.println(Solution1137.tribonacci(2));
        System.out.println(Solution1137.tribonacci(3));
        System.out.println(Solution1137.tribonacci(4));
        System.out.println(Solution1137.tribonacci(25));
    }

}

