package com.interview.javaTest.leetcode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-05-06 21:56:19
 **/
public class Main12312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //行数
        HashMap<String, String> map = new HashMap();
        for (int i = 0; i < n - 1; i++) {
            System.out.println(sc.next());
        }
    }
}
