package com.sjzc.algorithm.basic;

import lombok.Data;

/**
 * @author zhaochong
 * @Description
 * @create: 2020/6/21 8:21 下午
 **/
public class NodeTest {

    /**
     * 单向链表
     *
     * @param <T>
     */
    public static class Node<T> {
        private T value;
        private Node next;
    }

    /**
     * 双向链表Node
     *
     * @param <T>
     */
    @Data
    public static class DNode<T> {
        private T value;
        private DNode<T> pre;
        private DNode<T> next;

        public DNode(T value) {
            this.value = value;
        }
    }

    /**
     * 双向链表
     *
     * @param <T>
     */
    public static class DoubleNodeList<T> {
        private DNode<T> head;
        private DNode<T> tail;

        public void addFirst(T value) {
            DNode<T> cur = new DNode<T>(value);
            if (head == null) {
                head = cur;
                tail = cur;
            } else {
                cur.next = head;
                head.pre = cur;
                head = cur;
            }
        }

        public void addLast(T value) {
            DNode<T> cur = new DNode<T>(value);
            if (tail == null) {
                head = cur;
                tail = cur;
            } else {
                cur.pre = tail;
                tail.next = cur;
                tail = cur;
            }
        }

        public T popFirst() {
            if (head == null) {
                return null;
            }
            DNode<T> cur = head;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.pre = null;
                cur.next = null;
            }
            return cur.value;
        }

        public T popLast() {
            if (tail == null) {
                return null;
            }
            DNode<T> cur = tail;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.pre;
                tail.next = null;
                cur.pre = null;
            }
            return cur.value;
        }


        public boolean isEmpty() {
            return head == null;
        }
    }
}
