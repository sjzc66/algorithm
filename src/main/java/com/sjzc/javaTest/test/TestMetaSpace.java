package com.sjzc.javaTest.test;

/**
 * @author zhaochong
 * @Description
 * @create: 2020/5/25 12:12 上午
 **/
public class TestMetaSpace {

    public static int[] size = new int[10 * 1024 * 1024];

    public static void main(String[] args) {
        System.out.println(TestMetaSpace.size.length);
        System.out.println(size.length);
    }
}
