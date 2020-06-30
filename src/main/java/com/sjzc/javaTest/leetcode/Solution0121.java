package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 相交链表
 * <p>
 * Solution0160
 * @create: 2020-04-26 20:13
 **/
public class Solution0121 {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] > min) {
                res = Math.max((prices[i] - min), res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // int[] arr = {2, 100, 1, 200, 4};
        // int[] arr = {2, 1, 4};
        // int[] arr = {7,1,5,3,6,4};
        // int[] arr = {7, 6, 4, 5,3, 1};
        int[] arr = {3, 2, 6, 5, 0, 3};
        System.out.println(Solution0121.maxProfit(arr));
    }

}

