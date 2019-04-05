package com.sjzc.javaTest.designPatterns.facade;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 17:40 2019/4/5
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
