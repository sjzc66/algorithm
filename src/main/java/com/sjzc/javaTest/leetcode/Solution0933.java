package com.sjzc.javaTest.leetcode;


import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author zhaochong
 * @Description 最近的请求次数
 * <p>
 * Solution0933
 * @create: 2020-04-26 20:13
 **/
public class Solution0933 {

    LinkedBlockingQueue<Integer> queue = null;

    public Solution0933() {
        queue = new LinkedBlockingQueue<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (t - 3000 > queue.peek()) {
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        Solution0933 solution0933 = new Solution0933();
        System.out.println(solution0933.ping(1));
        System.out.println(solution0933.ping(100));
        System.out.println(solution0933.ping(3001));
        System.out.println(solution0933.ping(3002));
        System.out.println(solution0933.ping(10000));
    }
}


