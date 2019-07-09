package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 两个数相加
 * @create: 2019-07-08 18:09
 **/
public class Solution0002 {

    /**
     * 提交版本
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        int shi = 0;
        int ge = 0;
        ListNode rtn = new ListNode(0);
        ListNode index = rtn;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            ge = (x + y + shi) % 10;
            shi = (x + y + shi) / 10;
            index.next = new ListNode(ge);
            index = index.next;
            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
        }
        if (shi > 0) {
            index.next = new ListNode(shi);
        }
        return rtn.next;
    }

    public void print(ListNode node) {
        if (node==null) return;
        while (node.next != null) {
            System.out.print(node.val);
            System.out.print("->");
            node = node.next;
        }
        System.out.println(node.val);
    }

    public int convert(ListNode node) {
        StringBuilder sb = new StringBuilder();
        if (node==null) return 0;
        while (node.next != null) {
            sb.append(node.val);
            node = node.next;
        }
        sb.append(node.val);
        return Integer.parseInt(sb.reverse().toString());
    }

    public ListNode convert(int num) {
        String s = String.valueOf(num);
        ListNode node = null;
        for (int i = 0; i < s.length(); i++) {
            ListNode n = new ListNode(s.charAt(i));
            n.next = node;
            node = n;
        }
        return node;
    }

    public static void main(String[] args) {
        // TODO: 2019-07-08
        ListNode a0 = new ListNode(2);
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(3);
        a0.next = a1;
        a1.next = a2;

        ListNode b0 = new ListNode(5);
        ListNode b1 = new ListNode(6);
        ListNode b2 = new ListNode(4);
        b0.next = b1;
        b1.next = b2;
        Solution0002 s = new Solution0002();
        s.print(a0);
        s.print(b0);
        ListNode x = new ListNode(1);
        ListNode y1 = new ListNode(9);
        ListNode y2 = new ListNode(9);
        y1.next = y2;
        ListNode listNode = s.addTwoNumbers(x, y1);
        s.print(listNode);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}