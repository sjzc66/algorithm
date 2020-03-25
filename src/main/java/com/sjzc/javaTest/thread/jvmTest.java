package com.sjzc.javaTest.thread;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 15:04 2019/4/8
 */
public class jvmTest {
    //public static void main(String[] args) {
    //    long totalPage = Long.MAX_VALUE;
    //    for (int i = 0; i < totalPage; i++) {
    //        if (i < 0) {
    //            //System.out.println(i);
    //        }
    //    }
    //}

    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        for (int i = 0; i < 1000; i++) {
            longAdder.add(1);
        }
        System.out.println(longAdder);
        AtomicLong atomicLong = new AtomicLong(0);
        for (int i = 0; i < 1000; i++) {
            atomicLong.incrementAndGet();
        }
        System.out.println(atomicLong);
    }
}
