package com.sjzc.javaTest.leetcode;

import java.util.concurrent.CountDownLatch;

/**
 * @author sjzc
 * @Description: synchronize 实现 交替打印
 * @Date: Created in 22:02 2019/4/6
 */
public class TestThreadPrint {

    public static void main(String[] args) throws Exception {

        final Object o = new Object();
        char[] c1 = "123456".toCharArray();
        char[] c2 = "ABCDEF".toCharArray();

        CountDownLatch countDownLatch = new CountDownLatch(1);

        Thread t1 = new Thread(() -> {
            synchronized (o) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (char c : c1) {
                    System.out.print(c);
                    try {
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        });


        Thread t2 = new Thread(() -> {
            synchronized (o) {
                countDownLatch.countDown();
                for (char c : c2) {
                    System.out.print(c);
                    try {
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        });

        t1.start();
        t2.start();
    }

}