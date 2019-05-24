package com.sjzc.javaTest.leetcode;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author sjzc
 * @Description: 树的层序遍历
 * @Date: Created in 13:33 2019/5/21
 */
public class TreeNodePrintSolution {

    public void print(TreeNode treeNode) {
        LinkedBlockingQueue<Object> objects = Queues.newLinkedBlockingQueue();
        Lists.newArrayList();
        this.print(treeNode, new LinkedBlockingQueue<>());
    }

    private void print(TreeNode node,Queue<TreeNode> queue) {
        if (node == null) return;
        System.out.println(node.getValue());
        if (node.getLeft() != null) queue.add(node.getLeft());
        if (node.getRight() != null) queue.add(node.getRight());
        print(queue);
    }

    private void print(Queue<TreeNode> nodes) {
        TreeNode peek = nodes.poll();
        this.print(peek,nodes);
    }

    public static void main(String[] args) {
        TreeNode g = new TreeNode("G", null, null);
        TreeNode f = new TreeNode("F", null, null);
        TreeNode e = new TreeNode("E", null, null);
        TreeNode d = new TreeNode("D", null, null);
        TreeNode c = new TreeNode("C", f, g);
        TreeNode b = new TreeNode("B", d, e);
        TreeNode a = new TreeNode("A", b, c);
        TreeNodePrintSolution solution = new TreeNodePrintSolution();
        solution.print(a);

        Queue queue = new ArrayDeque();
        Queue qq = new ArrayBlockingQueue(10);

        queue.poll();
    }
}

class TreeNode{
    String value;
    TreeNode left;
    TreeNode right;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode (String value, TreeNode left, TreeNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}