package com.sjzc.algorithm;

import java.util.Stack;

/**
 * @author zhaochong
 * @Description 栈的最小值
 * @create: 2020/6/21 8:56 下午
 **/
public class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> min;

    public MinStack() {
        data = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        int cur = min.size() > 0 ? min.peek() : 0;
        if (min.size() == 0 || cur > x) {
            min.push(x);
        } else {
            min.push(cur);
        }
    }

    public void pop() {
        data.pop();
        min.pop();
    }

    public int top() {
        return data.size() > 0 ? data.peek() : 0;
    }

    public int getMin() {
        return min.size() > 0 ? min.peek() : 0;
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }
}
