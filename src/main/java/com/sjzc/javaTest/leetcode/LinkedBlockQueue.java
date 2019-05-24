package com.sjzc.javaTest.leetcode;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 11:19 2019/5/24
 */
public class LinkedBlockQueue<E> {
    class Node<E>{
        E value;
        Node<E> next;
    }
    private final AtomicInteger count = new AtomicInteger();
    final ReentrantLock takeLock = new ReentrantLock();
    final ReentrantLock putLock = new ReentrantLock();
    transient Node<E> head;
    private transient Node<E> last;

    void poll(E e) {
        if (e == null) throw new NullPointerException();
        Node<E> headTmp = this.head;
        while (headTmp.next != null) {

        }
    }
}
