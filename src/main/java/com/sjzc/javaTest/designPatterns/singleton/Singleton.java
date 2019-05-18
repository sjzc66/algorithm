package com.sjzc.javaTest.designPatterns.singleton;

/**
 * 禁止指令重排的单例模式
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 16:24 2019/3/26
 */
public class Singleton {
    public static int i = 1;

    private static volatile Singleton instance;         //1 volatile

    private Singleton() {}          //2  私有构造函数

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {        // 3 初始化时候锁定对象
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.i);;
        System.out.println("123");
    }
}