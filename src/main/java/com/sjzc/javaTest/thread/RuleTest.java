package com.sjzc.javaTest.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhaochong
 * @Description
 * @create: 2019-08-19 18:07
 **/
public class RuleTest {

    final Lock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();

    public static void main(String[] args) {
        RuleTest ruleTest = new RuleTest();
        AtomicInteger i = new AtomicInteger(2);
        Thread1 thread1 = ruleTest.new Thread1(i);
        Thread2 thread2 = ruleTest.new Thread2(i);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }


    class Thread1 extends Thread{
        private AtomicInteger count;

        public Thread1(AtomicInteger count) {
            this.count = count;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000L);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Thread2 extends Thread{
        private AtomicInteger count;

        public Thread2(AtomicInteger count) {
            this.count = count;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(990L);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}


