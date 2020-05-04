package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 二分查找
 * <p>
 * Solution0034
 * @create: 2020-04-26 20:13
 **/
public class Solution0053 {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0; //后面的指针
        int qianzhang = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i != left ) {
                if (nums[left] < 0) {
                    sum -= nums[left];
                    left++;
                    continue;
                }
                if (nums[i] + nums[left] < 0) {
                    sum -= nums[left];
                    left++;
                    maxSum = maxSum > sum ? maxSum : sum;
                    continue;
                }
                if (nums[i] < 0) {
                    qianzhang += nums[i];
                }
            }
            maxSum = maxSum > sum ? maxSum : sum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,-1,-2,2,1,-2,1,4,-5,4};
        Solution0053 solution0053 = new Solution0053();
        int i = solution0053.maxSubArray(nums);
        System.out.println(i);
    }
}


// class Solution {
//     public int maxSubArray(int[] nums) {
//         if (nums.length == 0) {
//             return 0;
//         }
//         int maxSum = Integer.MIN_VALUE;
//         int sum = 0;
//         int left = 0; //后面的指针
//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i];
//             if (i != left && nums[i] + nums[left] < 0) {
//                 sum -= nums[left];
//                 left++;
//             }
//             maxSum = maxSum > sum ? maxSum : sum;
//         }
//         return maxSum;
//     }
// }

