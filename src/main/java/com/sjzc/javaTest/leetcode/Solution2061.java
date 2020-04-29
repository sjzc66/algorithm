package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 扑克牌中的顺子
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution2061 {

    public boolean isStraight(int[] nums) {
        int min = 15;
        int max = -1;
        int[] oknumber = new int[14];
        if (nums.length != 5) return false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                continue;
            }
            oknumber[nums[i]]++;
            //有重复的直接失败
            if (oknumber[nums[i]] > 1) {
                return false;
            }
            //保存最小
            if (min > nums[i]) {
                min = nums[i];
            }
            //保存最大
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        if ((max - min) > 4) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        Solution2061 solution2061 = new Solution2061();
        boolean straight = solution2061.isStraight(nums);
        System.out.println(straight);
    }
}


