package com.sjzc.javaTest.leetcode;

import java.util.Arrays;

/**
 * @author zhaochong
 * @Description 合并排序的数组
 * <p>给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 * <p>
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * @create: 2020-06-22 19:00:09
 **/
public class Solution1001 {

    public void merge(int[] A, int m, int[] B, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int index = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            A[index--] = A[p1] > B[p2] ? A[p1--] : B[p2--];
        }
        while (p1 >= 0) {
            A[index--] = A[p1--];
        }
        while (p2 >= 0) {
            A[index--] = B[p2--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        Solution1001 solution = new Solution1001();
        solution.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}


