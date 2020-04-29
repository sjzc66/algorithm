package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 面试题36. 二叉搜索树与双向链表
 * <p>
 * Solution0426
 * @create: 2020-04-26 20:13
 **/
public class Solution2003_2 {


    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    void dfs(Node cur) {
        if(cur == null) return;
        dfs(cur.left);
        if(pre != null) pre.right = cur;
        else head = cur;
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }


    // public Node treeToDoublyList(Node root) {
    //     if (root==null) return null;
    //     Node leftHead = treeToDoublyList(root.left);
    //     Node rightHead = treeToDoublyList(root.right);
    //     if (leftHead != null) {
    //         root.left = leftHead.left;
    //         leftHead.left.right=root;
    //     }
    //     if (rightHead != null) {
    //         root.right = rightHead;
    //         rightHead.left = root;
    //     }
    //     leftHead.left = rightHead.left;
    // }


    // public void jianliShu(Node root) {
    //     Node zuiyoubian = jianliLeft(root.l);
    //     Node zuizuobian = jianliRight(root);
    //
    // }
    //
    // //返回最右边
    // public Node jianliLeft(Node root) {
    //
    // }
    //
    // //返回最左边
    // public Node jianliRight(Node root) {
    //
    // }

    // public Node[] treeToList(Node root) {
    //     Node[] duan = new Node[2];
    //     Node left = returnLeftNode(root);
    //     Node right = returnRightNode(root);
    //     duan[0] = left;
    //     duan[1] = right;
    //
    //     while (root.left != null) {
    //
    //     }
    //
    //     return duan;
    // }

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

        Solution2003_2 solution2003 = new Solution2003_2();
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


