package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 二叉树减枝
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0814 {
    class Info {
        boolean isAllZero;

        public Info(boolean isAllZero) {
            this.isAllZero = isAllZero;
        }
    }

    public TreeNode pruneTree(TreeNode root) {
        process(root);
        return root;
    }

    public Info process(TreeNode root) {
        if (root == null) {
            return new Info(true);
        }

        boolean isAllZero = false;

        Info left = process(root.left);
        Info right = process(root.right);
        if (left.isAllZero && right.isAllZero && root.val == 0) {
            isAllZero = true;
        }
        if (left.isAllZero) {
            root.left = null;
        }
        if (right.isAllZero) {
            root.right = null;
        }
        return new Info(isAllZero);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(0);
        TreeNode l2 = new TreeNode(0);
        TreeNode l3 = new TreeNode(1);
        root.right = l1;
        l1.left = l2;
        l1.right = l3;
        Solution0814 solution0001 = new Solution0814();
        TreeNode treeNode = solution0001.pruneTree(root);
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