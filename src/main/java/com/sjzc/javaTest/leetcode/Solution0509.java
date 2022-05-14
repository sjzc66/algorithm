package com.sjzc.javaTest.leetcode;

import java.util.Arrays;

/**
 * @author zhaochong
 * @Description 斐波那契数列
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0509 {

    public int fib(int n) {
        if (n == 0) return 0;
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        return fib(f, n);
    }

    public int fib(int[] nums, int n) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) {
            return nums[n];
        }
        if (nums[n] != 0) {
            return nums[n];
        }
        int result = fib(nums, n - 1) + fib(nums, n - 2);
        result = (int) (result % (1e9 + 7));
        nums[n] = result;
        return result;
    }


    public int fib1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int ans = 0;
        int l = 0;
        int r = 1;
        for (int i = 1; i < n; i++) {
            ans = l + r;
            l = r;
            r = ans;
        }
        return ans;
    }

    public int fib2(int n) {
        int[] dp = new int[n + 2];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        int ans = process(n, dp);
        return ans;
    }

    private int process(int n, int[] dp) {
        if (dp[n] != -1) {
            return dp[n];
        }
        int result = process(n - 1, dp) + process(n - 2, dp);
        return result;
    }

    public static void main(String[] args) {
        Solution0509 solution0509 = new Solution0509();
        // int fib = solution0509.fib(50);
        // System.out.println(fib);
        System.out.println(solution0509.fib1(0));
        System.out.println(solution0509.fib1(1));
        System.out.println(solution0509.fib1(2));
        System.out.println(solution0509.fib1(3));
        System.out.println(solution0509.fib1(4));
        System.out.println(solution0509.fib1(5));
        System.out.println(solution0509.fib1(6));
        System.out.println("--------");
        System.out.println(solution0509.fib2(0));
        System.out.println(solution0509.fib2(1));
        System.out.println(solution0509.fib2(2));
        System.out.println(solution0509.fib2(3));
        System.out.println(solution0509.fib2(4));
        System.out.println(solution0509.fib2(5));
        System.out.println(solution0509.fib2(6));
    }
}


