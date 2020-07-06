package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 单值二叉树
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0965 {
    class Info {
        int val;
        boolean isUnivalTree;

        public Info(int val, boolean isUnivalTree) {
            this.val = val;
            this.isUnivalTree = isUnivalTree;
        }
    }

    public boolean isUnivalTree(TreeNode root) {
        return process(root).isUnivalTree;
    }

    public Info process(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return new Info(root.val, true);
        }

        int val = 0;
        boolean isUnivalTree = false;

        Info left = process(root.left);
        Info right = process(root.right);
        if (left != null && right != null &&
                left.isUnivalTree && right.isUnivalTree &&
                (root.val == left.val) &&
                (left.val == right.val)) {
            val = left.val;
            isUnivalTree = true;
            return new Info(val, isUnivalTree);
        }
        if (left == null && root.val == left.val) {
            val = right.val;
            isUnivalTree = right.isUnivalTree;
        }
        if (right == null && root.val == right.val) {
            val = left.val;
            isUnivalTree = left.isUnivalTree;
        }
        return new Info(val, isUnivalTree);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(3);
        TreeNode l2 = new TreeNode(3);
        root.left = l1;
        Solution0965 solution0001 = new Solution0965();
        boolean univalTree = solution0001.isUnivalTree(root);
        System.out.println(univalTree);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}