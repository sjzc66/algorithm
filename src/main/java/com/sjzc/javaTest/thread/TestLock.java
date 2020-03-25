package com.sjzc.javaTest.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhaochong
 * @Description
 * @create: 2020/3/23 9:03 下午
 **/
public class TestLock {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();

    }
}
