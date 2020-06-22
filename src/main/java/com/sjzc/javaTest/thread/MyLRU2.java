package com.sjzc.javaTest.thread;

import java.util.HashMap;

/**
 * @author zhaochong
 * @Description 手写LRU，手写双端链表
 * @create: 2020/6/19 12:15 下午
 **/
public class MyLRU2 {


    public static void main(String[] args) {
        MyLruCache cache = new MyLruCache(2 /* 缓存容量 */);
        // cache.put(1, 1);
        // cache.put(2, 2);
        // cache.get(1);       // 返回  1
        // cache.put(3, 3);    // 该操作会使得关键字 2 作废
        // cache.get(2);       // 返回 -1 (未找到)
        // cache.put(4, 4);    // 该操作会使得关键字 1 作废
        // cache.get(1);       // 返回 -1 (未找到)
        // cache.get(3);       // 返回  3
        // cache.get(4);       // 返回  4

        // cache.put(2, 1);
        // cache.put(1, 1);
        // cache.put(2, 3);
        // cache.put(4, 1);
        // cache.get(1);
        // cache.get(2);

        cache.put(2, 1);
        cache.put(2, 2);
        cache.get(2);
        cache.put(1, 1);
        cache.put(4, 1);
        cache.get(2);
    }


    static class DNode {
        Integer key;
        Integer value;
        private DNode pre, next;

        DNode() {
        }

        DNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    static class MyLruCache {
        int size;
        HashMap<Integer, DNode> map = new HashMap<>();
        private DNode head, tail;

        MyLruCache(int size) {
            this.size = size;
            head = new DNode();
            tail = new DNode();
            head.next = tail;
            tail.pre = head;
        }

        public int get(int key) {
            DNode dNode = map.get(key);
            if (dNode == null) {
                System.out.println(-1);
                return -1;
            }
            moveToLast(dNode);
            System.out.println(dNode.value);
            return dNode.value;
        }

        public void put(int key, int value) {
            DNode dNode = map.get(key);
            if (dNode == null) {
                dNode = new DNode(key, value);
                if (map.size() < size) {
                    map.put(key, dNode);
                    addLast(dNode);
                } else if (map.size() >= size) {
                    map.remove(head.next.key);
                    map.put(key, dNode);
                    removeFirst();
                    addLast(dNode);
                }
            } else {
                dNode.value = value;
                map.put(key, dNode);
                moveToLast(dNode);
            }
        }

        private void removeFirst() {
            if (head.next.next != null) {
                head.next = head.next.next;
                head.next.pre = head;
            }
        }

        private void addLast(DNode dNode) {
            tail.pre.next = dNode;
            dNode.pre = tail.pre;
            dNode.next = tail;
            tail.pre = dNode;
        }

        private void moveToLast(DNode dNode) {
            // 先删除节点
            dNode.pre.next = dNode.next;
            dNode.next.pre = dNode.pre;
            // 放到最后
            // tail.pre.next = dNode;
            // dNode.pre = tail.pre;
            //
            // dNode.next.next = tail;
            // tail.pre = dNode.next;

            tail.pre.next = dNode;
            dNode.pre = tail.pre;

            dNode.next = tail;
            tail.pre = dNode;


        }
    }


}
