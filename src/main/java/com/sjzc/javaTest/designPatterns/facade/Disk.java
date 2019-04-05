package com.sjzc.javaTest.designPatterns.facade;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 17:39 2019/4/5
 */
public class Disk {
    public void startup() {
        System.out.println("disk startup!");
    }

    public void shutdown() {
        System.out.println("disk shutdown!");
    }
}
