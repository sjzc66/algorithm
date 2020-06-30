package com.sjzc.algorithm.basic;

/**
 * @author zhaochong
 * @Description
 * @create: 2020/6/23 2:46 下午
 **/
public class test {

    public static void main(String[] args) {
        B b = new B();
    }
}

class A{
    public A() {
        System.out.println("A.instance");
    }
    static {
        System.out.println("a.static");
    }
}

class B extends A{
    public B() {
        System.out.println("B.instance");
    }

    static {
        System.out.println("b.static");
    }
}
