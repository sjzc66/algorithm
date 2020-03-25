package com.sjzc.javaTest.thread;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-24 09:54
 * @create: 2020/3/23 9:03 下午
 **/
public class TestLock {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        LinkedList list = new LinkedList();
        list.peek();
        try {
            lock.lock();
            lock.tryLock();
        } catch (Exception e) {

        }finally {
            lock.unlock();
        }
        lock.lock();
        lock.unlock();

    }
}
