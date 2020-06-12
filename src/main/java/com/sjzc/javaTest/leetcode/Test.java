package com.sjzc.javaTest.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author sjzc
 * @Description: 输入string
 * @Date: Created in 22:02 2019/4/6
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 5) {
                    LockSupport.park();
                }
                if (i == 8) {
                    LockSupport.park();
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();
        LockSupport.unpark(t);
        LockSupport.unpark(t);
    }

}