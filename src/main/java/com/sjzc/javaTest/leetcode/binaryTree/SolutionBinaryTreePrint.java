package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 二叉树的序列化
 * @Date: Created in 22:02 2019/4/6
 */
public class SolutionBinaryTreePrint {

    // 先序
    public void prePrint(TreeNode root) {
        if (root == null) {
            System.out.print( "null,");
            return;
        }
        System.out.print(root.val + ",");
        prePrint(root.left);
        prePrint(root.right);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(0);
        TreeNode l2 = new TreeNode(0);
        TreeNode l3 = new TreeNode(1);
        root.right = l1;
        l1.left = l2;
        l1.right = l3;
        SolutionBinaryTreePrint solution0001 = new SolutionBinaryTreePrint();
        solution0001.prePrint(root);
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