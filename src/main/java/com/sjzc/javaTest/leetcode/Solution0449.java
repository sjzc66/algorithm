package com.sjzc.javaTest.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhaochong
 * @Description 序列化和反序列化二叉搜索树
 * <p> 数据 保证 输入的树是一棵二叉搜索树
 * Solution0933
 * @create: 2020-04-26 20:13
 **/
public class Solution0449 {

    // 前提条件：二叉搜索树
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            return "[]";
        }
        sb.append("[")
                .append(serializeRecursion(root))
                .deleteCharAt(sb.lastIndexOf(","))
                .append("]");
        return sb.toString();
    }

    private String serializeRecursion(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val)
                .append(",")
                .append(serializeRecursion(root.left))
                .append(serializeRecursion(root.right));
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() <= 2) {
            return null;
        }
        String substring = data.substring(1, data.length() - 1);
        List<String> nodeList = Arrays.asList(substring.split(","));
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < nodeList.size(); i++) {
            queue.add(Integer.parseInt(nodeList.get(i)));
        }
        TreeNode treeNode = this.deserializeRecursion(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return treeNode;
    }

    private TreeNode deserializeRecursion(ArrayDeque<Integer> deque, int l, int h) {
        if (deque.isEmpty()) {
            return null;
        }
        if (deque.peek() < l || deque.peek() > h) {
            return null;
        }
        Integer m = deque.pop();
        TreeNode left = this.deserializeRecursion(deque, l, m);
        TreeNode right = this.deserializeRecursion(deque, m, h);
        TreeNode mid = new TreeNode(m);
        mid.left = left;
        mid.right = right;
        return mid;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode rightLeft = new TreeNode(3);
        right.left = rightLeft;

        root.left = left;
        root.right = right;

        Solution0449 solution0449 = new Solution0449();
        String serialize = solution0449.serialize(null);
        System.out.println(serialize);
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}




