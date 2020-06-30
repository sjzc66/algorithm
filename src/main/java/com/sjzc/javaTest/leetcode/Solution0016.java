package com.sjzc.javaTest.leetcode;

import java.util.Arrays;

/**
 * @author sjzc
 * @Description: 最接近的三数之和
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0016 {

    public int threeSumClosest(int[] nums, int target) throws Exception {
        Arrays.sort(nums);
        int sum = 0;
        int best = 1000000;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                // 相等的话，直接是答案
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum < target) {
                    j++;
                }
                if (sum > target) {
                    k--;
                }
            }

        }
        return best;
    }

    public static void main(String[] args) throws Exception {
        Solution0016 s = new Solution0016();
        int[] nums = {-3, -2, -5, 3, -4};
        int i = s.threeSumClosest(nums, -1);
        System.out.println(i);
    }
}