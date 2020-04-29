package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 二分查找
 * <p>
 * Solution0034
 * @create: 2020-04-26 20:13
 **/
public class Solution0034 {

    public int search(int[] nums, int target) {
        return binarySearch(nums, target + 0.5) - binarySearch(nums, target - 0.5);
    }

    private int binarySearch(int[] nums, double target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return left;
    }
}


