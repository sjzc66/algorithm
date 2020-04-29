package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 二叉搜索树的第k大节点
 * <p>
 * Solution0034
 * @create: 2020-04-26 20:13
 **/
public class Solution2005 {

    TreeNode resultNode = null;
    int count;

    public int kthLargest(TreeNode root, int k) {
        count = k;
        nodeNumber(root);
        return resultNode.val;
    }

    public void nodeNumber(TreeNode root) {
        if (root == null) return;
        nodeNumber(root.right);
        if (count == 1) {
            resultNode = root;
            count--;
            return;
        }
        count--;
        nodeNumber(root.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node5.left = node3;
        node5.right = node6;
        node3.left = node2;
        node3.right = node4;
        node2.left = node1;

        int i = new Solution2005().kthLargest(node5, 1);
        System.out.println(i);
    }
}


