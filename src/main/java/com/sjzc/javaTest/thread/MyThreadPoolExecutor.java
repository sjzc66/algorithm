package com.sjzc.javaTest.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-28 13:45
 **/
public class MyThreadPoolExecutor implements Executor {

    private String name;
    private int coreSize;
    private int maxSize;
    private BlockingQueue<Runnable> taskQueue;
    private RejectedPolicy rejectPolicy;

    private AtomicInteger runningCount = new AtomicInteger(0);


    @Override
    public void execute(Runnable task) {
        int count = runningCount.get();
        if (count < coreSize) {
            if (addWorker(task, true)) {
                return;
            }
        }
        System.gc();
        if (taskQueue.offer(task)) {

        } else {
            if (!addWorker(task, true)) {
                rejectPolicy.rejectedExecution(task, this);
            }
        }
    }

    private boolean addWorker(Runnable task, boolean b) {
        return false;
    }

    public MyThreadPoolExecutor(String name, int coreSize, int maxSize, BlockingQueue<Runnable> taskQueue, RejectedPolicy rejectPolicy) {
        this.name = name;
        this.coreSize = coreSize;
        this.maxSize = maxSize;
        this.taskQueue = taskQueue;
        this.rejectPolicy = rejectPolicy;
    }
}

class DiscardRejectPolicy implements RejectedPolicy {

    @Override
    public void rejectedExecution(Runnable r, MyThreadPoolExecutor executor) {
        // do nothing
        System.out.println("discard one task");
    }
}

interface RejectedPolicy {
    void rejectedExecution(Runnable r, MyThreadPoolExecutor executor);
}