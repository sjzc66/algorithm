package com.sjzc.algorithm.basic;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhaochong
 * @Description
 * @create: 2020/6/22 1:45 下午
 **/
public class MaxNum {

    public static AtomicInteger i = new AtomicInteger();
    public static AtomicInteger j = new AtomicInteger();


    public static int max(int[] arr) {
        int max = -1;
        for (int cu : arr) {
            i.incrementAndGet();
            if (max < cu) {
                max = cu;
            }
        }
        return max;
    }

    public static int max2(int[] arr) {
        return max2(arr, 0, arr.length - 1);
    }

    public static int max2(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = l + ((r - l) >> 1);
        int lmax = max2(arr, l, mid);
        int rmax = max2(arr, mid + 1, r);
        j.incrementAndGet();
        return Math.max(lmax, rmax);
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        // System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        System.out.println(MaxNum.max(arr));
        long end = System.currentTimeMillis();
        System.out.println(i + "-" + (end-start));

        start = System.currentTimeMillis();
        System.out.println(MaxNum.max2(arr));
        end = System.currentTimeMillis();
        System.out.println(j + "-" + (end-start));
    }
}
