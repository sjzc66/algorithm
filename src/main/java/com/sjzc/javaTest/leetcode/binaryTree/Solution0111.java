package com.sjzc.javaTest.leetcode.binaryTree;

/**
 * @author sjzc
 * @Description: 二叉树的最小深度
 * //给定一个二叉树，找出其最小深度。
 * //
 * // 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * //
 * // 说明: 叶子节点是指没有子节点的节点。
 * //
 * // 示例:
 * //
 * // 给定二叉树 [3,9,20,null,null,15,7],
 * //
 * //     3
 * //   / \
 * //  9  20
 * //    /  \
 * //   15   7
 * //
 * // 返回它的最小深度 2.
 * // Related Topics 树 深度优先搜索 广度优先搜索
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0111 {
    public int minDepth(TreeNode root) {
        int res = 0;
        if (root == null) return res;
        if (isLeaf(root)) return 1;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (l==0) return 1 + r;
        if (r==0) return 1 + l;
        return 1 + Math.min(l, r);
    }

    private boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            return true;
        }
        return false;
    }

    // public int minDepth(TreeNode root) {
    //     int res = 0;
    //     if (root == null) return res;
    //     if (root.left == null && root.right == null) {
    //         return 1;
    //     }
    //     if (!(root.left != null && root.right != null)) {
    //         return 2;
    //     }
    //     return min(root);
    // }
    // private int min(TreeNode root) {
    //     int res = 0;
    //     if (root.left == null) {
    //         return res + 1;
    //     }
    //     if (root.right == null) {
    //         return res + 1;
    //     }
    //     return 1 + Math.min(min(root.left), min(root.right));
    // }
    // public int minDepth(TreeNode root) {
    //     int res = 0;
    //     if (root == null) return res;
    //
    //     dfs(root, res);
    //     return res;
    // }
    //
    // private int dfs(TreeNode root,int res) {
    //
    //     return 0;
    // }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(3);
        root.left = l1;
        root.right = l2;
        l1.left = new TreeNode(5);
        // l2.right = new TreeNode(6);
        Solution0111 solution0001 = new Solution0111();
        System.out.println(solution0001.minDepth(root));
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