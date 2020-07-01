package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 分割链表
 * 86. 分隔链表
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * <p>
 * 你应当保留两个分区中每个节点的初始相对位置。
 * <p>
 * 示例:
 * <p>
 * 输入: head = 1->4->3->2->5->2, x = 3
 * 输出: 1->2->2->4->3->5
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0086 {

    public ListNode partition(ListNode head, int x) {
        ListNode lH = null;
        ListNode lT = null;
        ListNode gH = null;
        ListNode gT = null;
        ListNode temp = null;

        while (head != null) {
            temp = head.next;
            head.next = null;
            if (head.val < x) {
                if (lH == null) {
                    lH = head;
                    lT = head;
                } else {
                    lT.next = head;
                    lT = head;
                }
            } else {
                if (gH == null) {
                    gH = head;
                    gT = head;
                } else {
                    gT.next = head;
                    gT = head;
                }
            }
            head = temp;
        }

        if (lT != null) {
            lT.next = gH;
            return lH;
        }
        return gH;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l1.print();

        Solution0086 solution0021 = new Solution0086();
        ListNode listNode = solution0021.partition(l1,4);
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


