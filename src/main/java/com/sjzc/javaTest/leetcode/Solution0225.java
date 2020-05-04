package com.sjzc.javaTest.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhaochong
 * @Description 两个队列实现一个栈
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0225 {
    static class MyStack {

        Queue<Integer> queue = new LinkedList();
        Queue<Integer> tempQueue = new LinkedList();
        int top;


        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.add(x);
            top = x;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int result = 0;
            while (queue.size() > 1) {
                tempQueue.add(queue.poll());
            }
            result = queue.poll();
            while (tempQueue.size() > 0) {
                top = tempQueue.poll();
                queue.add(top);
            }
            return result;
        }

        /** Get the top element. */
        public int top() {
            return top;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println(stack.empty());
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }


}


