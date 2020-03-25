package com.sjzc.javaTest.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author zhaochong
 * @Description
 * @create: 2020/3/23 8:57 下午
 **/
public class TestPool {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(4);
        pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                System.out.println("完成");
            }
        });
        pool.execute(new RecursiveTask<Object>() {
            @Override
            protected Object compute() {
                return "完成";
            }
        });


        String initialReference = "initial value referenced";

        AtomicReference<String> atomicStringReference =
                new AtomicReference<String>(initialReference);

        String newReference = "new value referenced";
        boolean exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
        System.out.println("exchanged: " + exchanged);

        exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
        System.out.println("exchanged: " + exchanged);
    }
}
