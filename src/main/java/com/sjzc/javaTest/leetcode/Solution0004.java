package com.sjzc.javaTest.leetcode;

/**
 * @author sjzc
 * @Description: 寻找两个有序数组的中位数
 * @Date: 2019-07-26 15:02:14
 */
public class Solution0004 {
    //给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
    //请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
    //你可以假设 nums1 和 nums2 不会同时为空。
    //示例 1:
    //nums1 = [1, 3]
    //nums2 = [2]
    //则中位数是 2.0
    //示例 2:
    //nums1 = [1, 2]
    //nums2 = [3, 4]
    //则中位数是 (2 + 3)/2 = 2.5
    public int findMedianSortedArrays(int[] num1, int[] num2) {
        int count = num1.length + num2.length;
        int midIndex;
        boolean isOddNumber = false;
        if (count % 2 == 1) {
            midIndex = count / 2 + 1;
            isOddNumber = true;
        } else {
            midIndex = count / 2;
            isOddNumber = false;
        }
        int index = midIndex;
        int i = 0;
        int iLength = num1.length;
        int j = 0;
        int jLength = num2.length;
        while (i<iLength-1 && j<jLength-1) {
            if (num1[i] < num2[j]) {

            }
        }
        // TODO: 2019-07-26


        return 0;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {2};
        Solution0004 so = new Solution0004();
        int mid = so.findMedianSortedArrays(num1, num2);
        System.out.println(mid);
    }
}