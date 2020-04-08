package com.sjzc.testJVM;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-29 11:44
 **/
public class TestSize {
    int a;
    long b;
    static int c;

    public static void main(String[] args) {
        TestSize size = new TestSize();
        int a = 1;
        int b = 1;
        goon:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            continue goon;
        }
        System.out.println("finsh");
    }
    final public void print(){
        System.out.println("ok");
    }

    // class xxx{
    //     print();
    // }
}

