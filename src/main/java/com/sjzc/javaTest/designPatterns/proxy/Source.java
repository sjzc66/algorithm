package com.sjzc.javaTest.designPatterns.proxy;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("thr original method!");
    }
}


