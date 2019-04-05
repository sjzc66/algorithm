package com.sjzc.javaTest.designPatterns.proxy;

public class ProxyTest{
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
