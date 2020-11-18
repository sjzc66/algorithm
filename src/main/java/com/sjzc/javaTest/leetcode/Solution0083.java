package com.sjzc.javaTest.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 //给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 //
 // 示例 1:
 //
 // 输入: 1->1->2
 //输出: 1->2
 //
 //
 // 示例 2:
 //
 // 输入: 1->1->2->3->3
 //输出: 1->2->3
 // Related Topics 链表
 // 👍 414 👎 0
 * @create: 2020-10-22 10:45:03
 **/
public class Solution0083 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        Set set = new HashSet();
        ListNode res = head;
        set.add(head.val);
        while (head != null) {
            ListNode next = head.next;
            if (next == null) {
                break;
            }
            if (set.contains(next.val)) {
                head.next = next.next;
            } else {
                head = next;
            }
            set.add(next.val);
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next=node1;
        node1.next=node2;
        node2.next = node3;
        Solution0083 solution = new Solution0083();
        head.print();
        ListNode listNode = solution.deleteDuplicates(head);
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


