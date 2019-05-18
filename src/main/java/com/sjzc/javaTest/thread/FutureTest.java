package com.sjzc.javaTest.thread;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.*;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 10:56 2019/3/29
 */
public class FutureTest {

    ExecutorService fixedThreadPool = Executors.newCachedThreadPool();
    /**
     * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
     * ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
     * <p>
     * 阿里警告全文：
     * 线程池不允许使用Executors去创建，而是通过ThreadPoolExecutor的方式，这样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。 说明：Executors各个方法的弊端：
     * 1）newFixedThreadPool和newSingleThreadExecutor:
     *   主要问题是堆积的请求处理队列可能会耗费非常大的内存，甚至OOM。
     * 2）newCachedThreadPool和newScheduledThreadPool:
     *   主要问题是线程数最大数是Integer.MAX_VALUE，可能会创建数量非常多的线程，甚至OOM。
     * <p>
     * 例 1：
     * //org.apache.commons.lang3.concurrent.BasicThreadFactory
     * ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
     * new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(true).build());
     * <p>
     * <p>
     * 例 2：
     * ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
     * .setNameFormat("demo-pool-%d").build();
     * //Common Thread Pool
     * ExecutorService pool = new ThreadPoolExecutor(5, 200,
     * 0L, TimeUnit.MILLISECONDS,
     * new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
     * pool.execute(()-> System.out.println(Thread.currentThread().getName()));
     * pool.shutdown();//gracefully shutdown
     * <p>
     * <p>
     * <p>
     * 例 3：
     * <bean id="userThreadPool"
     * class="org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor">
     * <property name="corePoolSize" value="10" />
     * <property name="maxPoolSize" value="100" />
     * <property name="queueCapacity" value="2000" />
     * <property name="threadFactory" value= threadFactory />
     * <property name="rejectedExecutionHandler">
     * <ref local="rejectedExecutionHandler" />
     * </property>
     * </bean>
     * //in code
     * userThreadPool.execute(thread);
     */
    ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(5, new BasicThreadFactory.Builder().namingPattern("executeRule-pool-%d").daemon(true).build());


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1,2,60L,TimeUnit.SECONDS,new LinkedBlockingQueue<>());
        ThreadPoolExecutor pool1 = new ThreadPoolExecutor(1,2,60L,TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(10));
        executorService.submit(new Task());
    }

    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return null;
        }
    }


}
