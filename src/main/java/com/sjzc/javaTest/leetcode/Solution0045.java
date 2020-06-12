package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 *
 * 示例:
 *
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 说明:
 *
 * 假设你总是可以到达数组的最后一个位置。
 *  ☆贪心算法
 * @create: 2020-04-26 20:13
 **/
public class Solution0045 {

    public int jump(int[] nums) {
        return jumpxx(nums);
    }

    private int jumpxx(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == end) {
                end = maxPosition;
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        Solution0045 solution0045 = new Solution0045();
        int jump = solution0045.jump(nums);
        System.out.println(jump);
    }

}
