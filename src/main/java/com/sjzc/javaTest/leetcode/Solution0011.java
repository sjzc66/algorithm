package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 二分查找
 * <p>
 * Solution0034
 * @create: 2020-04-26 20:13
 **/
public class Solution0011 {

    public int maxArea(int[] height) {
        if (height.length< 2) return 0;
        int l = 0;
        int r = height.length - 1;
        int area = 0;
        while (l != r) {
            int nextArea = (r - l) * Math.min(height[l], height[r]);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
            area = Math.max(area, nextArea);
        }
        return area;
    }

    public static void main(String[] args) {
        Solution0011 solution0011 = new Solution0011();
        // int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] nums = {1, 1};
        int i = solution0011.maxArea(nums);
        System.out.println(i);
    }

}

