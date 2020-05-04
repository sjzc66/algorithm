package com.sjzc.testJVM;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-04-08 14:17
 **/
public class TestGc {
    // public static void main(String[] args) {
    //     // byte[] placeholdersss = new byte[64 * 1024 * 1024];
    //     {
    //         byte[] placeholder = new byte[64 * 1024 * 1024];
    //     }
    //     int a = 0;
    //
    //     System.gc();
    // }

    public static void main(String[] args) {
        List list = new LinkedList();
        while (true) {
            byte[] bytes = new byte[1024 * 1024];
            list.add(bytes);
        }
    }

}
