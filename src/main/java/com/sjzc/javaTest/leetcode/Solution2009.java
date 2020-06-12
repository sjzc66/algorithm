package com.sjzc.javaTest.leetcode;

import java.util.Stack;

/**
 * @author zhaochong
 * @Description 用两个栈实现队列
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution2009 {

    static class CQueue {

        Stack<Integer> stackList;
        Stack<Integer>  temp;

        public CQueue() {
            stackList = new Stack();
            temp = new Stack();
        }

        public void appendTail(int value) {
            stackList.add(value);
        }

        public int deleteHead() {
            while (stackList.size() == 0) {
                return -1;
            }
            // 主stack里面有数据，把所有数据放到temp里面
            while (stackList.size() > 0) {
                temp.add(stackList.pop());
            }
            int pop = temp.pop();
            while (temp.size() > 0) {
                stackList.add(temp.pop());
            }
            return pop;
        }
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        int i2 = cQueue.deleteHead();
        System.out.println(i2);
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        int i = cQueue.deleteHead();
        System.out.println(i);
        int i1 = cQueue.deleteHead();
        System.out.println(i1);
    }
}


