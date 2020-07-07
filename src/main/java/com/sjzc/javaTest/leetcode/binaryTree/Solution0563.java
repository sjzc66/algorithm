package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 二叉树的坡度
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0563 {
    class Info {
        int podu;
        int sum;

        public Info(int podu, int sum) {
            this.podu = podu;
            this.sum = sum;
        }
    }

    public int findTilt(TreeNode root) {
        return process(root).podu;
    }

    public Info process(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info left = process(root.left);
        Info right = process(root.right);
        int sum = left.sum + right.sum + root.val;
        int podu = left.podu + right.podu + Math.abs(left.sum - right.sum);
        return new Info(podu, sum);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(3);
        TreeNode l3 = new TreeNode(4);
        TreeNode l4 = new TreeNode(5);
        root.left = l1;
        root.right = l2;

        Solution0563 solution0001 = new Solution0563();
        int tilt = solution0001.findTilt(root);
        System.out.println(tilt);
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