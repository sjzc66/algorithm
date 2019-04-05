package com.sjzc.javaTest.designPatterns.facade;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 17:38 2019/4/5
 */
public class CPU {

    public void startup() {
        System.out.println("cpu startup!");
    }

    public void shutdown() {
        System.out.println("cpu shutdown!");
    }
}
