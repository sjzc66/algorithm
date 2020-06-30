package com.sjzc.algorithm.basic;

import java.util.Arrays;

/**
 * @author zhaochong
 * @Description 数组中，查两个不重复的数
 * @create: 2020/6/22 1:45 下午
 **/
public class SingleNum {

    // public static int singleNumbers(int[] nums) {
    //     int res = 0;
    //     for (int n : nums) {
    //         res ^= n;
    //     }
    //     return res;
    // }

    public static int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        int AEorB = 0;
        for (int i : nums) {
            AEorB ^= i;
        }
        int rightOne = AEorB & (~AEorB + 1);
        int a = 0;
        for (int i : nums) {
            if ((i & rightOne) == 0) {
                a ^= i;
            }
        }
        res[0] = a;
        res[1] = a ^ AEorB;
        return res;
    }


    public static void main(String[] args) {
        // int[] nums1 = {1, 2, 3, 4, 1, 2, 5, 3, 4};
        int[] nums2 = {1, 2, 3, 4, 1, 7, 2, 5, 3, 4};
        // System.out.println(SingleNum.singleNumbers(nums1));
        System.out.println(Arrays.toString(SingleNum.singleNumbers(nums2)));
    }
}
