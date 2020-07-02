package com.sjzc.javaTest.designPatterns.singleton;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-04-16 18:32
 **/
public class SingletonInner {
    private SingletonInner(){

    }
    private static class SingletonInnerHolder {
        private static SingletonInner instance = new SingletonInner();
    }

    public static SingletonInner getInstance() {
        return SingletonInnerHolder.instance;
    }
}
