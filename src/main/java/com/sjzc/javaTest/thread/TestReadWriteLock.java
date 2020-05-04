package com.sjzc.javaTest.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author zhaochong
 * @Description
 * @create: 2020/3/25 9:56 下午
 **/
public class TestReadWriteLock {
    public static void main(String[] args) {
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        readWriteLock.readLock().lock();
        readWriteLock.writeLock().lock();
        readWriteLock.writeLock().unlock();
        readWriteLock.readLock().unlock();
        System.out.println("ok1");
    }
}
