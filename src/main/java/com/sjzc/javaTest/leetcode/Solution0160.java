package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 相交链表
 * <p>
 * Solution0160
 * @create: 2020-04-26 20:13
 **/
public class Solution0160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        int circleCount = 0;
        if (headA == null || headB == null) {
            return null;
        }
        while (pA != pB) {
            if (pA != pB) {
                pA = pA.next;
                pB = pB.next;
            }
            if ((circleCount == 2) && (pA == null)) {
                break;
            }
            if (pA == null) {
                pA = headB;
                circleCount++;
            }
            if (pB == null) {
                pB = headA;
                circleCount++;
            }
        }

        return pA;
    }


    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        if (headA == null || headB == null) {
            return null;
        }
        while (pA != pB) {
            pA = pA == null ? pA = headB : pA.next;
            pB = pB == null ? pB = headA : pB.next;
        }
        return pA;
    }

    public static void main(String[] args) {
        Solution0160 solution = new Solution0160();

        System.out.println(1 ^ 1);
        System.out.println(1 ^ 0);
        System.out.println(0 ^ 1);
        System.out.println(0 ^ 0);

        ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode node1 = new ListNode(4, new ListNode(3, common));
        ListNode node2 = new ListNode(5, new ListNode(0, new ListNode(1, common)));
        node1.print();
        node2.print();
        ListNode intersectionNode = solution.getIntersectionNode2(node1, node2);
        if (intersectionNode != null) {
            intersectionNode.print();
        }else{
            System.out.println(intersectionNode);
        }
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

