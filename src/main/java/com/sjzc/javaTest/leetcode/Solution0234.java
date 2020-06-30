package com.sjzc.javaTest.leetcode;

import java.util.Stack;

/**
 * @author zhaochong
 * @Description 回文链表
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0234 {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        Stack<Integer> stack = new Stack();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        //全部进stack
        cur = head;
        while (cur != null) {
            if (cur.val != stack.pop()) {
                return false;
            }
            cur = cur.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        boolean palindrome = Solution0234.isPalindrome(node1);
        System.out.println(palindrome);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


