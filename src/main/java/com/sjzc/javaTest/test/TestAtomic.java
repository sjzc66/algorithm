package com.sjzc.javaTest.test;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-10 15:49
 **/
public class TestAtomic {

    public static void main(String[] args) {
        AtomicBoolean isOk = new AtomicBoolean(true);
        System.out.println(isOk);
        System.out.println(isOk.get());
        isOk.set(false);
        System.out.println(isOk);
        System.out.println(isOk.get());

        short s1 = 1;
        s1 += 1;
        short s2 = 1;
        s2 = (short) (s2 + 1);

        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        LongAdder longAdder = new LongAdder();
        longAdder.add(1L);
        System.out.println(longAdder);
    }
}
