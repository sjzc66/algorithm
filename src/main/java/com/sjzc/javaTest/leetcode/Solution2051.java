package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 逆序对
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution2051 {

    public int reversePairs(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return calc(nums, 0, nums.length - 1);
    }

    public int calc(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = l + ((r - l) >> 1);
        return calc(arr, l, mid)
                + calc(arr, mid + 1, r)
                + merge(arr, l, mid, r);
    }

    private int merge(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int p1 = l;
        int p2 = m + 1;
        int i = 0;
        int res = 0;
        while (p1 <= m && p2 <= r) {
            res += arr[p1] > arr[p2] ? m - p1 + 1 : 0;
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
        return res;
    }

    public static void main(String[] args) {
        // int[] nums = {7, 5, 6, 4};
        int[] nums = {1, 3, 2, 3, 1};
        Solution2051 solution = new Solution2051();
        System.out.println(solution.reversePairs(nums));
    }
}


