package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 缺失的第一个正数
 * @create: 2020-06-27 14:54:32
 **/
public class Solution0041 {

    public int firstMissingPositive(int[] nums) {
        // TODO: 2020/6/27 未完成
        int i = 0;
        long sum = 0L;
        long mySum = 0L;
        for (int num : nums) {
            if (num > 0) {
                i++;
                sum += i;
                mySum += num;
            }
        }
        sum += ++i;
        return (int) (sum - mySum);
    }

    public int firstMissingPositive2(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        if (max > nums.length) {
            max = nums.length;
        }
        int[] ss = new int[max];
        boolean exist = false;
        for (int i = 1; i < max; i++) {
            exist = false;
            for (int num : nums) {
                if (i == num) {
                    exist = true;
                }
            }
            if (exist == false) {
                return i;
            }
        }
        return max + 1;
    }

    public static void main(String[] args) {
        // int[] nums = {1, 2, 0};
        // int[] nums = {3, 4, -1, 1};
        int[] nums = {2};
        Solution0041 solution0045 = new Solution0041();
        int jump = solution0045.firstMissingPositive2(nums);
        System.out.println(jump);
    }

}
