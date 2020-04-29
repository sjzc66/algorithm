package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 数组中数字出现的次数
 * <p>
 * Solution2004
 * @create: 2020-04-26 20:13
 **/
public class Solution2004 {


    public int[] singleNumbers(int[] nums) {
        int[] index = new int[1000];
        for (int i = 0; i < index.length; i++) {
            index[i] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (index[nums[i]] > 0) {
                index[nums[i]]--;
            }else {
                index[nums[i]]++;
            }
        }
        int[] result = new int[2];
        int k = 0;
        for (int i = 0; i < index.length; i++) {
            if (index[i] == 1) {
                result[k] = i;
                k++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // int[] input = {4, 1, 4, 6};
        // int[] input = {1,2,10,4,1,4,3,3};
        int[] input = {1,2,3,3};
        Solution2004 solution2004 = new Solution2004();
        int[] ints = solution2004.singleNumbers(input);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}


