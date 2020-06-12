package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description x的平方根
 * <p>
 * Solution0034
 * @create: 2020-04-26 20:13
 **/
public class Solution0069 {

    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int result = -1;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            if ((long)m * m <= x) {
                result = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution0069 solution0069 = new Solution0069();
        int sqrt = solution0069.mySqrt(10);
        System.out.println(sqrt);

        System.out.println(Math.sqrt(7));
    }
}

