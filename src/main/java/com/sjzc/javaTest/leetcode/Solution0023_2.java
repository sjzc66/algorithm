package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 合并k个链表
 * @create: 2020-04-26 20:13
 **/
public class Solution0023_2 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null && lists.length == 0) return null;
        ListNode result = null;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) {
                continue;
            }
            if (min > lists[i].val) {
                min = lists[i].val;
                minIndex = i;
            }
        }
        if (minIndex >= 0) {
            result = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;
            //还存在数据
            result.next = mergeKLists(lists);
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
        Solution0023_2 solution0023 = new Solution0023_2();
        ListNode result = solution0023.mergeKLists(listNodes);
        System.out.println("开始计算");
        result.print();
    }
}

// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }
