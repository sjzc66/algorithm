package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 二叉树的平衡
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0110 {
    class Info{
        int height;
        boolean isBalanced;

        public Info(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return process(root).isBalanced;
    }

    public Info process(TreeNode root) {
        if (root == null) {
            return new Info(0, true);
        }
        Info leftInfo = process(root.left);
        Info rightInfo = process(root.right);
        int height = 0;
        boolean isBalanced = false;
        height = Math.max(leftInfo.height, rightInfo.height) + 1;
        if (leftInfo.isBalanced == true && rightInfo.isBalanced == true
                && (Math.abs(leftInfo.height - rightInfo.height) < 2)) {
            isBalanced = true;
        }
        return new Info(height, isBalanced);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(3);
        TreeNode l2 = new TreeNode(3);
        root.left = l1;
        l1.right = l2;
        Solution0110 solution0001 = new Solution0110();
        boolean balanced = solution0001.isBalanced(root);
        System.out.println(balanced);
    }

    public  static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}