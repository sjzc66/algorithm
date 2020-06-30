package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 合并两个链表
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0328 {

    public ListNode oddEvenList(ListNode head) {
        ListNode oneHead = null;
        ListNode oneTail = null;
        ListNode twoHead = null;
        ListNode twoTail = null;
        boolean left = true;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = null;
            if (left) {
                if (oneHead == null) {
                    oneHead = head;
                    oneTail = head;
                } else {
                    oneTail.next = head;
                    oneTail = head;
                }
                left = false;
            } else {
                if (twoHead == null) {
                    twoHead = head;
                    twoTail = head;
                } else {
                    twoTail.next = head;
                    twoTail = head;
                }
                left = true;
            }
            head = next;
        }
        if (oneTail != null) {
            oneTail.next = twoHead;
        }
        return oneHead;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        // l5.next = l6;
        l1.print();

        Solution0328 solution0021 = new Solution0328();
        ListNode listNode = solution0021.oddEvenList(l1);
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


