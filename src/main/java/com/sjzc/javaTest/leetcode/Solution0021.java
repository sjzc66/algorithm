package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 反转链表
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 头结点
        ListNode index = new ListNode(0);
        ListNode headNode = new ListNode(0);
        index.next = headNode;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                index.next.next = l1;
                index.next = index.next.next;
                l1 = l1.next;
            } else {
                index.next.next = l2;
                index.next = index.next.next;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            index.next.next = l1;
            index.next = index.next.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            index.next.next = l2;
            index.next = index.next.next;
            l2 = l2.next;
        }
        return headNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.print();
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(6);
        l2.print();

        Solution0021 solution0021 = new Solution0021();
        ListNode listNode = solution0021.mergeTwoLists(l1, l2);
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


