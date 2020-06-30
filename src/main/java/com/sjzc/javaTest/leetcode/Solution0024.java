package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 合并两个链表
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0024 {

    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode res = head.next;
        ListNode t = null;
        while (head != null && head.next != null) {
            if (t != null) {
                t.next = head.next;
            }
            t = head;
            head = head.next;
            t.next = t.next.next;
            head.next = t;
            head = t.next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        // l2.next = l3;
        // l3.next = l4;
        // l4.next = l5;
        l1.print();

        Solution0024 solution0021 = new Solution0024();
        ListNode listNode = solution0021.swapPairs(l1);
        listNode.print();
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        void print() {
            ListNode temp = this;
            while (temp.next != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            System.out.println(temp.val);
        }
    }
}


