package com.sjzc.javaTest.leetcode;

import java.util.LinkedList;

/**
 * @author zhaochong
 * @Description 重排链表
 * 143. 重排链表
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1:
 *
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 示例 2:
 *
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0143 {

    public void reorderList(ListNode head) {
        LinkedList<ListNode> list = new LinkedList<>();
        while (head != null) {
            list.addLast(head);
            head = head.next;
        }
        boolean isLeft = true;
        while (!list.isEmpty()) {
            if (isLeft) {
                list.pollFirst().next = list.peekLast();
                isLeft = false;
            } else {
                list.pollLast().next = list.peekFirst();
                isLeft = true;
            }
        }
    }

    public void reorderList2(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode newHead = head.next;
        ListNode pre = null;
        ListNode temp = null;
        head.next = null;
        while (newHead != null) {
            temp = newHead.next;
            newHead.next =pre;
            pre = newHead;
            newHead = temp;
        }
        head.next = pre;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l1.print();

        Solution0143 solution0021 = new Solution0143();
        solution0021.reorderList(l1);
        l1.print();
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


