package com.sjzc.javaTest.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

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


        Integer var1 = new Integer(1);
        Integer var2 = var1;
        GuavaTest.doSome(var2);
        System.out.println(var1.intValue());
        System.out.println(var1 == var2);

        BigDecimal a = new BigDecimal(1.0002).setScale(20, RoundingMode.HALF_UP);
        System.out.println(a);
        // BigDecimal b = a.setScale(20);
        // System.out.println(b);
    }

    public static void doSome(Integer integer) {
        integer = new Integer(2);
    }
}
