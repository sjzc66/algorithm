package com.sjzc.javaTest.leetcode;

import lombok.Data;

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

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 9, 1, 101};
        System.out.println(Arrays.toString(nums));
        SolutionHuawei02 solutionHuawei02 = new SolutionHuawei02();
        int i = solutionHuawei02.lengthOfLIS(nums);
        System.out.println(i);
    }
}
