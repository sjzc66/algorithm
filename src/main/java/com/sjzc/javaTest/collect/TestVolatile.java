package com.sjzc.javaTest.collect;

import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-22 22:39
 **/
public class TestVolatile {
    public static void main(String[] args) {
        // ConcurrentHashMap map = new ConcurrentHashMap();
        // map.put("test", 123);
        // map.put("test2", 321);
        // List s = new ArrayList();
        // List s1 = new LinkedList();
        // System.out.println(map.keySet());
        // HashMap map = new HashMap(2 << 28);
        // map.put("123", "123");
        // Map map1 = Collections.synchronizedMap(map);

        // System.out.println(HashMap.tableSizeFor(123));
        LinkedHashMap map = new LinkedHashMap();
        map.put("1", 1);
        BlockingQueue q = new ArrayBlockingQueue(10);
        q.offer(1);
        ConcurrentMap map1 = new ConcurrentHashMap();
    }
}

class Person implements Delayed {

    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}