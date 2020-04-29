package com.sjzc.javaTest.leetcode;

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

    public static void main(String[] args) {
        Solution0509 solution0509 = new Solution0509();
        int fib = solution0509.fib(50);
        System.out.println(fib);
    }
}


