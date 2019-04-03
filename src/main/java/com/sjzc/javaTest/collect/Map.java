package com.sjzc.javaTest.collect;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author sjzc
 * @Description: 集合
 * @Date: Created in 16:39 2019/3/30
 */
public class Map {
    private int QUEUE_SIZE;


    //集合
    private Set set = new HashSet();
    private HashMap hashMap = new HashMap();
    private Hashtable hashtable = new Hashtable();
    private ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    private ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(QUEUE_SIZE);
    private CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
    private CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
    private ConcurrentSkipListMap concurrentSkipListMap = new ConcurrentSkipListMap();


    //这俩个有什么区别
    private ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
    private LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();

    //并发队列
    private Deque deque = new ArrayDeque();

    public static void main(String[] args) {
        List list = new ArrayList(10);
        list.add("1");
        list.add("2");
        System.out.println(list.size());
    }
}
