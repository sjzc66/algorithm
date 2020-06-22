package com.sjzc.javaTest.thread;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author zhaochong
 * @Description  手写LRU， 用原生list实现
 * @create: 2020/6/19 12:15 下午
 **/
public class MyLRU {


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

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        cache.get(1);
        cache.get(2);
    }

    static class MyLruCache {
        int size;
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList();

        MyLruCache(int size) {
            this.size = size;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                accessKey(key);
                System.out.println(map.get(key));
                return map.get(key);
            }
            System.out.println(-1);
            return -1;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                map.put(key, value);
                accessKey(key);
                return;
            }
            if (!map.containsKey(key)) {
                if (map.size() < size) {
                    map.put(key, value);
                    list.addLast(key);
                } else if (map.size() >= size) {
                    map.remove(list.peekFirst());
                    map.put(key, value);
                    list.pollFirst();
                    list.addLast(key);
                }
            }
        }

        public void accessKey(int key) {
            int aim = -1;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == key) {
                    aim = i;
                    break;
                }
            }
            list.remove(aim);
            list.addLast(key);
        }
    }


}
