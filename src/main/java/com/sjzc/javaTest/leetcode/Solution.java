package com.sjzc.javaTest.leetcode;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution {
    /**
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] rtn = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            rtn[0] = i;
            if (nums[i] <= target) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j]<0) continue;
                    if (nums[j] == remainder) {
                        rtn[1] = j;
                        return rtn;
                    }
                }
            }
            if (nums[i] >= target) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j]>0) continue;
                    if (nums[j] == remainder) {
                        rtn[1] = j;
                        return rtn;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println(result);


    }
}