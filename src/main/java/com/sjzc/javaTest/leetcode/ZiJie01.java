package com.sjzc.javaTest.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-04-25 09:37
 **/
public class ZiJie01 {

    public LinkedList topK(int[][] nums, int k) {
        int[] index = new int[nums[0].length];
        LinkedList result = null;
        while (result.size() < k) {
            result = digui(nums, k, null);
        }
        return result;
    }

    public LinkedList digui(int[][] nums,int k, int[] index) {
        if (index == null) {
            for (int i = 0; i < nums[0].length; i++) {

            }
        }
        return null;
    }

    public static void main(String[] args) {
        ZiJie01 s = new ZiJie01();
        int[][] nums = new int[3][3];
        nums[0] = new int[]{1, 2, 3};
        nums[1] = new int[]{1, 2, 5};
        nums[2] = new int[]{4, 5, 6};
        LinkedList topK = s.topK(nums,3);
        for (int i = 0; i < topK.size(); i++) {
            Object o = topK.get(i);
            System.out.println(o);
        }

    }
}
