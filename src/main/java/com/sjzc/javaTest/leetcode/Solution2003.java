package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 面试题36. 二叉搜索树与双向链表
 * <p>
 * Solution0426
 * @create: 2020-04-26 20:13
 **/
public class Solution2003 {


    public Node treeToDoublyList(Node root) {

        Node head = this.returnLeftNode(root);
        Node tail = this.returnRightNode(root);
        while (root.left != null) {
            treeToDoublyList(root.left);
            this.returnRightNode(root.left).right = root;
            root.left = this.returnRightNode(root.left);
        }
        while (root.right != null) {
            treeToDoublyList(root.right);
            this.returnLeftNode(root.right).left = root;
            root.right = this.returnLeftNode(root.right);
        }
        head.left = tail;
        tail.right = head;
        return head;
    }

    public Node returnLeftNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public Node returnRightNode(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node3= new Node(3);
        Node node2 = new Node(2, node1, node3);
        Node node5 = new Node(5);
        Node node4 = new Node(4, node2, node5);

        Solution2003 solution2003 = new Solution2003();
        Node node = solution2003.treeToDoublyList(node4);
        Node head = node;
        System.out.println(head.val);
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}


