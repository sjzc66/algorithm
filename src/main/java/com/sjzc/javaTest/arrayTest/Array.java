package com.sjzc.javaTest.arrayTest;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 11:00 2019/5/8
 */
public interface Array<T> {

    public T head();

    public Array<T> rest();

    public boolean isEmpty();
}
