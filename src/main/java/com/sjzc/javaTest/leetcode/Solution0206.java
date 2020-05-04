package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 反转链表
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode headPointer = new ListNode(0);
        ListNode anotherPointer = new ListNode(0);
        ListNode temp = new ListNode(0);
        headPointer.next = head;
        anotherPointer.next = head.next;
        if (headPointer.next.next != null) {
            headPointer.next.next = null;
        }
        if (anotherPointer.next == null) {
            return headPointer.next;
        }
        while (anotherPointer.next != null) {
            temp.next = anotherPointer.next;
            anotherPointer.next = anotherPointer.next.next;
            temp.next.next = headPointer.next;
            headPointer.next = temp.next;
        }
        return headPointer.next;
    }


    public static class ListNode {
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

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.print();
        Solution0206 solution0206 = new Solution0206();
        ListNode node = solution0206.reverseList(node1);
        node.print();
    }
}


