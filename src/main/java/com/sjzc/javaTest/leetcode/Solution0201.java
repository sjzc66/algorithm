package com.sjzc.javaTest.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaochong
 * @Description 扑克牌中的顺子
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0201 {

    public ListNode removeDuplicateNodes(ListNode head) {
        Set set = new HashSet();
        if (head == null) return null;
        ListNode res = head;
        set.add(head.val);
        while (head.next != null) {
            if (set.add(head.next.val)) {
                head = head.next;
            } else {
                head.next = head.next.next;
            }
        }
        return res;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        void print() {
            ListNode head = this;
            while (head != null) {
                System.out.print(head.val + "->");
                head = head.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        node.next = node2;
        node2.next = node3;
        node.print();
        Solution0201 solution = new Solution0201();
        solution.removeDuplicateNodes(node).print();

    }
}


