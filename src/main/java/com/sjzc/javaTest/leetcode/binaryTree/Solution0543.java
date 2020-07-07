package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 二叉树的直径
 * @Date: 2020-07-07 11:18:35
 */
public class Solution0543 {
    class Info {
        int max;
        int height;

        public Info(int max, int height) {
            this.max = max;
            this.height = height;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return process(root).max;
    }

    public Info process(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = process(root.left);
        Info rightInfo = process(root.right);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        //不包含x
        int max = Math.max(leftInfo.max, rightInfo.max);
        //包含x
        max = Math.max(leftInfo.height + rightInfo.height, max);
        return new Info(max, height);
    }


    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);
        TreeNode l4 = new TreeNode(4);
        TreeNode l5 = new TreeNode(5);
        l1.left = l2;
        l1.right = l3;
        l2.left = l4;
        l2.right = l5;
        Solution0543 solution0001 = new Solution0543();
        int i = solution0001.diameterOfBinaryTree(l1);
        System.out.println(i);;
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