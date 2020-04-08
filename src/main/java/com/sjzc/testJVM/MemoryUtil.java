package com.sjzc.testJVM;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.defaultThreadFactory;
import static java.util.concurrent.Executors.newScheduledThreadPool;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-29 17:08
 **/
public class MemoryUtil {

    private MemoryUtil() {
    }

    /**
     * Logs current heap memory statistics.
     *
     * @see Runtime
     */
    public static void logMemoryStatistics() {
        Runtime runtime = Runtime.getRuntime();
        long freeBytes = runtime.freeMemory();
        long maxBytes = runtime.maxMemory();
        long totalBytes = runtime.totalMemory();
        long usedBytes = totalBytes - freeBytes;
        System.out.println("Memory (bytes): {"+usedBytes+"} used, {"+totalBytes+"} heap, {"+maxBytes+"} max");
    }

    private static volatile ScheduledExecutorService scheduler;

    /**
     * Constructs and starts a memory logger thread.
     *
     * @param rateInMillis how often memory info should be logged.
     */
    public static void startMemoryLogger(long rateInMillis) {
        stopMemoryLogger();
        scheduler = newScheduledThreadPool(1, new ThreadFactory() {
            private final ThreadFactory delegate = defaultThreadFactory();

            @Override
            public Thread newThread(Runnable r) {
                Thread t = delegate.newThread(r);
                t.setDaemon(true);
                return t;
            }
        });
        Runnable memoryLoogerRunnable = new Runnable() {
            @Override
            public void run() {
                logMemoryStatistics();
            }
        };
        scheduler.scheduleAtFixedRate(memoryLoogerRunnable, rateInMillis, rateInMillis,
                TimeUnit.MILLISECONDS);
    }

    /**
     * Constructs and starts a memory logger thread with a logging rate of 1000 milliseconds.
     */
    public static void startMemoryLogger() {
        startMemoryLogger(1000);
    }

    /**
     * Stops the memory logger, if any, started via {@link #startMemoryLogger(long)} or
     * {@link #startMemoryLogger()}.
     */
    public static void stopMemoryLogger() {
        if (scheduler != null) {
            scheduler.shutdownNow();
            scheduler = null;
        }
    }
}
