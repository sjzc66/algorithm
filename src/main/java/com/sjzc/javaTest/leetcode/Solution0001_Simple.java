package com.sjzc.javaTest.leetcode;

/**
 * @author sjzc
 * @Description: 两个数之和
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0001_Simple {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int x = 0;
        int y = 0;
        int count = 1;
        System.out.print(nums[0] + " ");
        while (x < nums.length) {
            if (x == y) {
                x++;
                continue;
            }
            if ((nums[x] ^ nums[y]) == 0) {
                x++;
                y++;
            }
            if (x >= nums.length || y>=nums.length) {
                continue;
            }
            if ((nums[x] ^ nums[y]) != 0) {
                nums[count] = nums[x];
                System.out.print(nums[count] + " ");
                x++;
                y++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution0001_Simple solution0001_simple = new Solution0001_Simple();
        int[] nums = {1,1};
        int i = solution0001_simple.removeDuplicates(nums);
        System.out.println(i);
    }
}