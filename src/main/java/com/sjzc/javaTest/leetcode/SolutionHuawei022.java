package com.sjzc.javaTest.leetcode;

import java.util.Arrays;

/**
 * @author zhaochong
 * @Description 最长上升子序列
 * @create: 2020/5/14 8:31 下午
 **/
public class SolutionHuawei022 {


    public int lengthOfLIS(int[] nums) {
        int result = 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            int max = dp[i];
            for (int j = 0; j < i; j++) {
                if (max > nums[j]) {
                    max = nums[j];
                }
                if (nums[j] < nums[i] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
                // 2 3 4 5 1 2 3 4 5 6 101
                // 1 2 3 4 1 2 3 4 5
            }
            if (result < dp[i]) {
                result = dp[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 9, 1, 101};
        System.out.println(Arrays.toString(nums));
        SolutionHuawei022 solutionHuawei02 = new SolutionHuawei022();
        int i = solutionHuawei02.lengthOfLIS(nums);
        System.out.println(i);
    }
}
