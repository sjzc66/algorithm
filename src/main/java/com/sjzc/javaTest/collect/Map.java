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

    //public static void main(String[] args) {
    //    List list = new ArrayList(10);
    //    list.add("1");
    //    list.add("2");
    //    System.out.println(list.size());
    //
    //    Set set = new HashSet();
    //    TreeSet treeSet = new TreeSet();
    //    SortedSet sortedSet = new TreeSet();
    //    SortedSet<Integer> sortedSet1 = new TreeSet<>();
    //}


    //public static void main(String[] args) {
    //    List list = Arrays.asList("1", "2", "3", "4");
    //    List list1 = list.subList(1, 4);
    //    System.out.println(list1);
    //}

    public static void main(String[] args) {
        Integer integer = Integer.valueOf("128");
        Integer integer2 = Integer.valueOf("128");
        System.out.println(integer == integer2);
        System.out.println(Integer.valueOf("256") == Integer.valueOf("256"));
        System.out.println(Integer.valueOf("128") == Integer.valueOf("128"));
        System.out.println(Integer.valueOf("256") == Integer.parseInt("256"));
        System.out.println(Integer.parseInt("128") == Integer.valueOf("128"));
        System.out.println(Integer.valueOf("128") == new Integer(128));
        System.out.println(Integer.parseInt("128") == new Integer(128));
        System.out.println(Integer.parseInt("256") == new Integer(256));

    }
}
