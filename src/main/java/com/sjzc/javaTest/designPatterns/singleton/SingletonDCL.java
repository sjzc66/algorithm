package com.sjzc.javaTest.designPatterns.singleton;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-04-16 18:32
 **/
public class SingletonDCL {
    private SingletonDCL(){

    }
    private static volatile SingletonDCL ins;

    public static SingletonDCL getInstance() {
        if (ins == null) {
            synchronized (SingletonDCL.class) {
                if (ins == null) {
                    ins = new SingletonDCL();
                }
            }
        }
        return ins;
    }
}
