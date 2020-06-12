package com.sjzc.javaTest.leetcode;

/**
 * @author sjzc
 * @Description: cas 实现交替打印
 * @Date: Created in 22:02 2019/4/6
 */
public class TestThreadPrint02 {

    enum RunType {t1, t2}
    static volatile RunType type = RunType.t1;

    public static void main(String[] args) throws Exception {


        char[] c1 = "123456".toCharArray();
        char[] c2 = "ABCDEF".toCharArray();

        Thread t1 = new Thread(() -> {
            for (char c : c1) {
                while (type != RunType.t1){}
                System.out.print(c);
                type = RunType.t2;
            }
        });


        Thread t2 = new Thread(() -> {
            for (char c : c2) {
                while (type != RunType.t2){}
                System.out.print(c);
                type = RunType.t1;
            }
        });

        t1.start();
        t2.start();
    }

}