package com.sjzc.javaTest.thread;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-25 14:23
 **/
public class TestVolatile4 {
    public static long a = 0;
    public static long p1, p2, p3, p4, p5, p6, p7;
    public static volatile long b = 0;
    public static long q1, q2, q3, q4, q5, q6, q7;
    public static long c = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (a == 0) {
                long x = b;
            }
            System.out.println("a=" + a);
        }).start();

        new Thread(() -> {
            while (c == 0) {
                long x = b;
            }
            System.out.println("c=" + c);
        }).start();

        Thread.sleep(100);
        a = 1;
        b = 1;
        c = 1;
    }

}
