package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 搜索旋转数组
 * @create: 2020-04-26 20:13
 **/
public class Solution0033 {
    /**
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     * <p>
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     * <p>
     * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     * <p>
     * 你可以假设数组中不存在重复的元素。
     * <p>
     * 你的算法时间复杂度必须是 O(log n) 级别。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [4,5,6,7,0,1,2], target = 0
     * 输出: 4
     * 示例 2:
     * <p>
     * 输入: nums = [4,5,6,7,0,1,2], target = 3
     * 输出: -1
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        return search(nums, target, 0, nums.length - 1);
    }

    public int search(int[] nums, int target, int left, int right) {
        int resultIndex = -1;
        if (left == right && target != nums[left]) {
            return resultIndex;
        }
        int middleIndex = (left + right) / 2;
        if (target == nums[middleIndex]) return middleIndex;
        if (target == nums[left]) return left;
        if (target == nums[right]) return right;
        if (nums[left] < nums[middleIndex]) {
            // 左侧正常升序
            // if (target > nums[left] && target < nums[right]) {
            //     resultIndex = search(nums, target, left, middleIndex);
            // } else {
            //     resultIndex = search(nums, target, middleIndex + 1, right);
            // }
            if (target < nums[left]) {
                resultIndex = search(nums, target, middleIndex + 1, right);
            }
            if (target > nums[left] && target < nums[middleIndex]) {
                resultIndex = search(nums, target, left, middleIndex);
            }
            if (target > nums[left] && target > nums[middleIndex]) {
                resultIndex = search(nums, target, middleIndex, right);
            }
        } else {
            // 右侧正常升序
            if (target > nums[right]) {
                resultIndex = search(nums, target, left, middleIndex);
            }
            if (target < nums[right] && target < nums[middleIndex]) {
                resultIndex = search(nums, target, left, middleIndex);
            }
            if (target < nums[right] && target > nums[middleIndex]) {
                resultIndex = search(nums, target, middleIndex + 1, right);
            }
        }
        return resultIndex;
    }

    public static void main(String[] args) {
        // int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int[] nums = {5, 1, 2, 3, 4};
        // int[] nums = {0, 1, 2, 4, 5, 6, 7};
        // int[] nums = {1,3};
        int target = 1;
        Solution0033 solution0033 = new Solution0033();
        int search = solution0033.search(nums, target);
        System.out.println(search);
    }
}
