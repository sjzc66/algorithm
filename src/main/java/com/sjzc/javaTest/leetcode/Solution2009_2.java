package com.sjzc.javaTest.leetcode;

import java.util.Stack;

/**
 * @author zhaochong
 * @Description 用两个栈实现队列
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution2009_2 {

    static class CQueue {

        Stack<Integer> push;
        Stack<Integer> pop;

        public CQueue() {
            push = new Stack();
            pop = new Stack();
        }

        public void appendTail(int value) {
            push.push(value);
            pushToPop();
        }

        public int deleteHead() throws Exception {
            if (push.isEmpty() && pop.isEmpty()) {
                // throw new Exception("is Empty");
                return -1;
            }
            pushToPop();
            return pop.pop();
        }

        private void pushToPop() {
            if (pop.isEmpty()) {
                while (!push.isEmpty()) {
                    pop.push(push.pop());
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        CQueue cQueue = new CQueue();
        int i2 = cQueue.deleteHead();
        System.out.println(i2);
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        cQueue.appendTail(3);
        int i = cQueue.deleteHead();
        System.out.println(i);
        int iiii = cQueue.deleteHead();
        System.out.println(iiii);
        int i1 = cQueue.deleteHead();
        System.out.println(i1);
    }
}


