package com.sjzc.algorithm.basic;

/**
 * @author zhaochong
 * @Description 奶牛问题，瓷砖问题
 * @create: 2020/6/21 11:18 下午
 **/
public class Fibernate {

    public int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        int left = 1;
        int right = 1;
        for (int i = 3; i <= n; i++) {
            left = left + right;
            left = left ^ right;
            right = left ^ right;
            left = left ^ right;
        }
        return right;
    }

    public static void main(String[] args) {
        Fibernate fibernate = new Fibernate();
        System.out.println(fibernate.f(7));

    }
}
