package com.sjzc.javaTest.thread;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-24 09:54
 **/
public class TestLock {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();

        LinkedList list = new LinkedList();
        list.peek();
        lock.wait();
        try {
            lock.lock();
            lock.tryLock();
        } catch (Exception e) {

        }finally {
            lock.unlock();
        }
    }
}
