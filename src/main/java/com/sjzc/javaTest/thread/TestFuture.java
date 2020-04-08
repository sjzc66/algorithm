package com.sjzc.javaTest.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-30 22:17
 **/
public class TestFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int result = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Future<Integer> submit = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName());
                    return finalI;
                }
            });
            System.out.println(submit.getClass());
            Integer integer = submit.get();
            result += integer;
        }
        System.out.println(result);
    }
}
