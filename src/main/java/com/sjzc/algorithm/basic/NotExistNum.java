package com.sjzc.algorithm.basic;

import java.util.Arrays;

/**
 * @author zhaochong
 * @Description 消失的两个数
 * @create: 2020/6/22 1:45 下午
 **/
public class NotExistNum {

    public static int[] missingTwo(int[] nums) {
        int length = nums.length + 2;
        int eor = 0;
        for (int i = 0; i < nums.length; i++) {
            eor ^= nums[i];
        }
        for (int i = 1; i <= length; i++) {
            eor ^= i;
        }
        int rightOne = eor & (~eor + 1);
        int firstOne = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & rightOne) != 0) {
                firstOne ^= nums[i];
            }
        }
        for (int i = 1; i <= length; i++) {
            if ((i & rightOne) != 0) {
                firstOne ^= i;
            }
        }
        int[] res = {firstOne, firstOne ^ eor};
        return res;
    }

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
        // int[] nums2 = {1, 2, 3, 4, 1, 7, 2, 5, 3, 4};
        // // System.out.println(SingleNum.singleNumbers(nums1));
        // System.out.println(Arrays.toString(NotExistNum.singleNumbers(nums2)));
        int[] arr = {1, 3};
        int[] ints = NotExistNum.missingTwo(arr);
        System.out.println(Arrays.toString(ints));
    }
}
