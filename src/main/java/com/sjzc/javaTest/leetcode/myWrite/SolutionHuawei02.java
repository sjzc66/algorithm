package com.sjzc.javaTest.leetcode.myWrite;

import java.util.Arrays;

/**
 * @author zhaochong
 * @Description 最长上升子序列
 * @create: 2020/5/14 8:31 下午
 **/
public class SolutionHuawei02 {


    public int lengthOfLIS(int[] nums) {
        int result = 0;
        int[] maxLength = new int[nums.length];
        int currentMin = 0;
        for (int i = maxLength.length - 1; i >= 0; i--) {
            int length = 1;
            currentMin = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < currentMin) {
                    currentMin = nums[j];
                    length++;
                }
            }
            maxLength[i] = length;
            if (length > result) {
                result = length;
            }
        }
        return result;
    }

    public int lengthOfLIS2(int[] nums) {
        return this.process(nums, nums.length - 1);
    }

    // 暴力递归
    private int process(int[] nums, int index) {
        if (index == 0) {
            // 只有一个元素，肯定单调递增
            return 1;
        }
        // 多个元素的，分情况讨论
        // 1.index-1 为最大元素
        int p1 = 0;
        if (nums[index - 1] < nums[index]) {
            p1 = process(nums, index - 1) + 1;
        }
        // 2.index-1 非最大元素
        int p2 = 0;
        p2 = process(nums, index - 1);
        int ans = Math.max(p1, p2);
        return ans;
    }

    public int lengthOfLIS3(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return this.process3(nums, nums.length - 1, dp);
    }

    // 暴力递归 + 记忆化搜索
    private int process3(int[] nums, int index, int[] dp) {
        if (dp[index] != -1) {
            // 只有一个元素，肯定单调递增
            return dp[index];
        }
        // 1.index-1 为最大元素
        int p1 = 0;
        if (nums[index - 1] < nums[index]) {
            p1 = process(nums, index - 1) + 1;
        }
        // 2.index-1 非最大元素
        int p2 = 0;
        p2 = process(nums, index - 1);
        int ans = Math.max(p1, p2);
        dp[index] = ans;
        return dp[index];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 9, 1, 101};
        Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums));
        SolutionHuawei02 solutionHuawei02 = new SolutionHuawei02();
        int i = solutionHuawei02.lengthOfLIS(nums);
        System.out.println(i);
        int j = solutionHuawei02.lengthOfLIS2(nums);
        System.out.println(j);
        int k = solutionHuawei02.lengthOfLIS3(nums);
        System.out.println(k);
    }
}
