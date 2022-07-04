package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 合并k个链表
 * @create: 2020-04-26 20:13
 **/
public class Solution0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null && lists.length == 0) return null;
        return mergeKLists(lists,0,lists.length-1);
    }

    public ListNode mergeKLists(ListNode[] lists,int left,int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            ListNode leftLift = mergeKLists(lists, left, middle);
            ListNode rightList = mergeKLists(lists, middle + 1, right);
            return mergeDoubleList(leftLift, rightList);
        }
        return lists[left];
    }

    public ListNode mergeDoubleList(ListNode leftList,ListNode rightList) {
        ListNode result = null;
        if (leftList == null) return rightList;
        if (rightList == null) return leftList;
        if (leftList.val < rightList.val) {
            result = leftList;
            leftList = leftList.next;
            result.next = mergeDoubleList(leftList, rightList);
        } else {
            result = rightList;
            rightList = rightList.next;
            result.next = mergeDoubleList(leftList, rightList);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1).setNext(new ListNode(4).setNext(new ListNode(5)));
        ListNode listNode2 = new ListNode(1).setNext(new ListNode(3).setNext(new ListNode(4)));
        ListNode listNode3 = new ListNode(2).setNext(new ListNode(6));
        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = listNode1;
        listNodes[1] = listNode2;
        listNodes[2] = listNode3;
        listNode1.print();
        listNode2.print();
        listNode3.print();
        Solution0023 solution0023 = new Solution0023();
        ListNode result = solution0023.mergeKLists(listNodes);
        System.out.println("开始计算");
        result.print();
    }
}