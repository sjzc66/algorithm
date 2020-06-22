package com.sjzc.javaTest.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zhaochong
 * @Description 回文链表
 * <p>
 * Solution0160
 * @create: 2020-04-26 20:13
 **/
public class Solution2206 {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // TODO: 2020/6/13 回文链表
        return false;
    }


    // public static void main(String[] args) {
    //     Solution2206 solution = new Solution2206();
    //     ListNode common = new ListNode(2, new ListNode(1));
    //     ListNode node1 = new ListNode(1, new ListNode(2, common));
    //     node1.print();
    //     boolean palindrome = solution.isPalindrome(node1);
    //     System.out.println(palindrome);
    // }

    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.getFirst();
        deque.pollFirst();
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }

        void print() {
            ListNode current = this;
            while (current != null) {
                System.out.print(current.val + "->");
                current = current.next;
            }
            System.out.println();
        }
    }

}

