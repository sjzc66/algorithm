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
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                point.x++;
            }
        });
        t1.start();
        t2.start();
        t1.join();
        // t2.join();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(point.x);
        System.out.println(point.y);
        t2.join();
        System.out.println(point.x);
    }

}

class Point {
     volatile long x;
    // long p1, p2, p3, p4, p5, p6, p7;
     volatile long y;
}
