package com.sjzc.javaTest.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-30 22:17
 **/
public class TestCountDownLautch {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        int result = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            try {
                Future<Integer> future = executorService.submit(new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName());
                        return finalI;
                    }
                });
                Integer integer = future.get();
                future.cancel(true);
                result += integer;
            }catch (Exception e){
                System.out.println();
            }finally {
                countDownLatch.countDown();
            }
        }
        System.out.println(result);
        countDownLatch.await();
        System.out.println(result);
    }
}
