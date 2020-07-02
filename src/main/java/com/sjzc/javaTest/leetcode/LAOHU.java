package com.sjzc.javaTest.leetcode;

/**
 * @author sjzc
 * @Description: 输入string
 * @Date: Created in 22:02 2019/4/6
 */
public class LAOHU {
    public static int findmax(int[] nums){
        if(nums.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i =0;i<nums.length;i++){
            currentSum+=nums[i];
            if(currentSum>max){
                max = currentSum;
            }
            //-3 -2 100 -3 100
            if(currentSum<0){
                currentSum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-3 ,-2, 100, -3,-98, 300 };
        int res = LAOHU.findmax(nums);
        System.out.println(res);
    }

}