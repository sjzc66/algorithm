package com.interview.javaTest.leetcode;

import java.util.Scanner;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-05-06 21:56:19
 **/
public class Main02 {

    public static String MaxTime(String[] strings) {
        int[] nums = new int[strings.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(strings[i]);
        }
        //TODO

        return "invalid";
    }

    public int[] InsertSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int temp = num[i];
            for (int j = i + 1; j < num.length; j--) {
                // if (num)
            }
        }
        return num;
    }

    public void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String substring = next.substring(1, next.length() - 1);
        String[] split = substring.split(",");
        System.out.println(MaxTime(split));
    }

}
