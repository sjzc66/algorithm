package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 二叉树的平衡
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0112_1 {
    class Info{
        boolean ok;
        boolean isLeaf;

        public Info(boolean ok, boolean isLeaf) {
            this.ok = ok;
            this.isLeaf = isLeaf;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        return process(root, sum).ok;
    }

    public Info process(TreeNode root,int target) {
        if (root == null) {
            if (target == 0) return new Info(true,true);
            if (target != 0) return new Info(false,true);
        }
        int subTarget = target - root.val;
        Info leftInfo = process(root.left,subTarget);
        Info rightInfo = process(root.right,subTarget);
        boolean ok = false;
        boolean isLeaf = false;
        if (leftInfo == null && rightInfo == null) {
            isLeaf = true;
        }
        if (leftInfo.isLeaf && rightInfo.isLeaf) {
            if (leftInfo.ok || rightInfo.ok) {
                ok = true;
            }
        }
        return new Info(ok,isLeaf);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(0);
        root.left = l1;
        root.right = l2;
        Solution0112_1 solution0001 = new Solution0112_1();
        boolean balanced = solution0001.hasPathSum(root,1);
        System.out.println(balanced);
    }

    public  static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}