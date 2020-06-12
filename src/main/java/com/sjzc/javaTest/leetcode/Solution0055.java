package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 给定一个非负整数数组，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 判断你是否能够到达最后一个位置。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * 示例 2:
 * <p>
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jump-game
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * ☆贪心算法
 * @create: 2020-04-26 20:13
 **/
public class Solution0055 {

    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        if (nums.length > 1 && nums[0] == 0) return false;
        int maxPosition = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (i <= maxPosition) {
                maxPosition = Math.max(maxPosition, nums[i] + i);
            }
        }
        return maxPosition >= nums.length - 1;
    }

    // public boolean canJump(int[] nums) {
    //     if (nums.length == 1) return true;
    //     // if (nums.length > 1 && nums[0] == 0) return false;
    //     int maxPosition = 0;
    //     boolean can = true;
    //     int zeroIndex = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         maxPosition = Math.max(maxPosition, nums[i] + i);
    //         if (nums[zeroIndex] == 0 && maxPosition <= zeroIndex && i > zeroIndex) {
    //             break;
    //         }
    //         if (maxPosition >= nums.length - 1) {
    //             return true;
    //         }
    //         if (nums[maxPosition] == 0 && maxPosition < nums.length) {
    //             zeroIndex = maxPosition;
    //             can = false;
    //         }
    //     }
    //     return can;
    // }

    // public boolean canJump(int[] nums) {
    //     if (nums.length == 1) return true;
    //     if (nums.length > 1 && nums[0] == 0) return false;
    //     boolean can = true;
    //     for (int i = nums.length - 1; i >= 0; i--) {
    //         if (nums[i] == 0) {
    //             if (i == nums.length - 1) {
    //                 break;
    //             }
    //             int count = 1;
    //             for (int j = i - 1; j >= 0; j--) {
    //                 if (nums[j] > count) {
    //                     can = true;
    //                     break;
    //                 }else {
    //                     can =false;
    //                     count++;
    //                 }
    //             }
    //         }
    //     }
    //     return can;
    // }

    // private int jumpxx(int[] nums) {
    //     int end = 0;
    //     int maxPosition = 0;
    //     int result = 0;
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         maxPosition = Math.max(maxPosition, nums[i] + i);
    //         if (i == end) {
    //             end = maxPosition;
    //             result++;
    //         }
    //     }
    //     return result;
    // }


    // public static void main(String[] args) {
    //     Integer a = new Integer(2);
    //     System.out.println(a.getClass().getClassLoader());
    //
    //     int[] nums = {1, 2, 3};
    //     Solution0055 solution0055 = new Solution0055();
    //     boolean b = solution0055.canJump(nums);
    //     System.out.println(b);
    // }


    public static void main(String[] args) {
        System.out.println(1^2^3^2^1);
    }
}
