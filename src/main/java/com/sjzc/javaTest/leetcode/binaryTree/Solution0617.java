package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 二叉树的合并  0617
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0617 {
    class Info{
        int height;
        boolean isBalanced;

        public Info(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        int m = t1.val + t2.val;
        TreeNode left = mergeTrees(t1.left, t2.left);
        TreeNode right = mergeTrees(t1.right, t2.right);
        TreeNode res = new TreeNode(m);
        res.left = left;
        res.right = right;
        return res;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(3);
        TreeNode l2 = new TreeNode(3);
        root.left = l1;
        Solution0617 solution0001 = new Solution0617();
        TreeNode treeNode = solution0001.mergeTrees(root, l2);
    }

    public  static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}