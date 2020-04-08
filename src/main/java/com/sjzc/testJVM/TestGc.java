package com.sjzc.testJVM;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-04-08 14:17
 **/
public class TestGc {
    public static void main(String[] args) {
        // byte[] placeholdersss = new byte[64 * 1024 * 1024];
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a = 0;

        System.gc();
    }

}
