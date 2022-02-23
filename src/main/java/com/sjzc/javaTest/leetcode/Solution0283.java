package com.sjzc.javaTest.leetcode;

import java.util.Arrays;

/**
 * @author sjzc
 * @Description:
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int current = 0;
        while (current < nums.length) {
            if (nums[current] == 0) {
                current++;
            } else {
                if (current != index) {
                    swap(nums, current, index);
                }
                current++;
                index++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(nums));
        Solution0283 solution0001 = new Solution0283();
        solution0001.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}