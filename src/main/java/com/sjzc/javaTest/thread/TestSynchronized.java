package com.sjzc.javaTest.thread;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-25 15:16
 **/
public class TestSynchronized {


    public static void sync() {
        synchronized (TestSynchronized.class) {
            synchronized (TestSynchronized.class) {

            }
        }
    }

    public static void main(String[] args) {

    }
}
