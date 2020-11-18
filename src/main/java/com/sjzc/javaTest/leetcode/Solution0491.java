package com.sjzc.javaTest.leetcode;

import java.util.List;

/**
 * @author sjzc
 * @Description:
 * //给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是2。
 * //
 * // 示例:
 * //
 * //
 * //输入: [4, 6, 7, 7]
 * //输出: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7
 * //]]
 * //
 * // 说明:
 * //
 * //
 * // 给定数组的长度不会超过15。
 * // 数组中的整数范围是 [-100,100]。
 * // 给定数组中可能包含重复数字，相等的数字应该被视为递增的一种情况。
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0491 {
    public static List<List<Integer>> findSubsequences(int[] nums) {
        // TODO: 2020/8/25
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {4, 6, 7, 7};
        List<List<Integer>> subsequences = Solution0491.findSubsequences(nums);
        System.out.println(subsequences);
    }
}