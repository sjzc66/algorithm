package com.sjzc.javaTest.test;

import java.util.concurrent.atomic.AtomicBoolean;

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
    }
}
