package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 最大二叉树
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int L, int R) {
        if (L>R) return null;
        if (L==R) return new TreeNode(nums[L]);
        int max = 0;
        int maxIndex = -1;
        for (int i = L; i <= R; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        TreeNode left = constructMaximumBinaryTree(nums, L, maxIndex - 1);
        TreeNode right = constructMaximumBinaryTree(nums, maxIndex + 1, R);

        TreeNode res = new TreeNode(nums[maxIndex]);
        res.left = left;
        res.right = right;
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 6, 0, 5};
        Solution0654 solution0001 = new Solution0654();
        TreeNode treeNode = solution0001.constructMaximumBinaryTree(nums);
    }

    public  static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}