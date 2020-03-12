package com.sjzc.javaTest.leetcode;

import java.util.List;

/**
 * @author sjzc
 * @Description: 两个数之和
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0018 {
    /**
     * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
     *
     * 满足要求的四元组集合为：
     * [
     *   [-1,  0, 0, 1],
     *   [-2, -1, 1, 2],
     *   [-2,  0, 0, 2]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/4sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        return null;
    }

    public static void main(String[] args) {
        Solution0018 s = new Solution0018();
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> lists = s.fourSum(nums, 0);
        System.out.println(lists);
    }
}