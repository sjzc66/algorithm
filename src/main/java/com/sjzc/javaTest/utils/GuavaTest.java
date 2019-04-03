package com.sjzc.javaTest.utils;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.primitives.Ints;

import java.util.Iterator;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 9:15 2019/3/16
 */
public class GuavaTest {

    public static void main(String[] args) {
        //1、list
        //ImmutableList<String> of = ImmutableList.of("a", "b", "c", "d");
        //
        //for (int i = 0; i < of.size(); i++) {
        //    System.out.println(of.get(i));
        //}

        //2、Splitter
        //Iterable split = Splitter.on(",").split("123,1,23");
        //Iterator iterator = split.iterator();
        //while (iterator.hasNext()) {
        //    System.out.println(iterator.next());
        //}

        //3、Joiner
        //int[] numbers = { 1, 2, 3, 4, 5 };
        //String numbersAsString = Joiner.on(",").join(Ints.asList(numbers));
        //System.out.println(numbersAsString);

        
    }
}
