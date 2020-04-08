package com.sjzc.javaTest.thread;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-25 11:47
 **/
public class TestVolatile {
    public static void main(String[] args) throws InterruptedException {
        TestVolatile.test(new Point());
    }

    private static void test(Point point) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                point.x++;
                // point.y++;
                // if (point.x == 500000000) {
                //     System.out.println(point.y);
                // }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                point.y++;
                // point.x++;
                // if (point.y == 500000000) {
                //     System.out.println(point.x);
                // }
            }
        });
        // System.out.println(System.nanoTime());
        // System.out.println(System.currentTimeMillis());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // System.out.println(point.x);
        // System.out.println(point.y);
        System.out.println(System.currentTimeMillis() - start);
    }

}

class Point {
    volatile long x;
    // long p1, p2, p3, p4, p5, p6, p7;
    volatile long y;
}
