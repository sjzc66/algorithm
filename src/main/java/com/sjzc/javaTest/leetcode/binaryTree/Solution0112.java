package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 路径总和
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0112 {
    class Info {
        boolean ok;
        boolean rootHas;

        public Info(boolean ok, boolean rootHas) {
            this.ok = ok;
            this.rootHas = rootHas;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return process(root, sum).ok;
    }

    public Info process(TreeNode root, int target) {
        if (root == null) {
            if (target == 0) return new Info(true, false);
            if (target != 0) return new Info(false, false);
        }
        int subTarget = target - root.val;
        Info leftInfo = process(root.left, subTarget);
        Info rightInfo = process(root.right, subTarget);
        boolean ok = false;
        boolean rootHas = true;
        if (leftInfo.rootHas == false && rightInfo.rootHas == false) {
            ok = leftInfo.ok || rightInfo.ok;
        }
        if (leftInfo.rootHas && rightInfo.rootHas) {
            ok = leftInfo.ok || rightInfo.ok;
        }
        if (leftInfo.rootHas && (rightInfo.rootHas == false)) {
            ok = leftInfo.ok;
        }
        if ((leftInfo.rootHas == false) && rightInfo.rootHas) {
            ok = rightInfo.ok;
        }
        return new Info(ok, rootHas);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(3);
        root.left = l1;
        root.right = l2;
        Solution0112 solution0001 = new Solution0112();
        boolean balanced = solution0001.hasPathSum(root, 4);
        System.out.println(balanced);
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