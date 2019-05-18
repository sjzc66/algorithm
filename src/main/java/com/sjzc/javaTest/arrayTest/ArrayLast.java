package com.sjzc.javaTest.arrayTest;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sjzc
 * @Description: solution
 * @Date: Created in 11:13 2019/5/8
 */
public class ArrayLast<T> extends ArrayLastElement<T>{
    //@Override
    //final T last(Array<T> array){
    //    T rtn = null;
    //    while (!array.isEmpty()) {
    //        rtn = array.head();
    //        array = array.rest();
    //    }
    //    return rtn;
    //}

    final T last(Array<T> array) throws NoSuchFieldException {
        Class<? extends Array> aClass = array.getClass();
        Field elements = aClass.getDeclaredField("elements");
        aClass.getField("elements");
        return null;
    }

    //public static void main(String[] args) throws NoSuchFieldException {
    //    //List list = new ArrayList();
    //    //Array array = new ArrayImpl(list);
    //    //String last = new ArrayLast<String>().last(new ArrayImpl<>(list));
    //    //System.out.println(last);
    //
    //    int i = Integer.parseInt("10");
    //    Integer integer = Integer.valueOf("10");
    //
    //    System.out.println(127==127); //true , int type compare
    //    System.out.println(128==128); //true , int type compare
    //    System.out.println(new Integer(127) == new Integer(127)); //false, object compare
    //    System.out.println(Integer.parseInt("128")==Integer.parseInt("128")); //true, int type compare
    //    System.out.println(Integer.valueOf("127")==Integer.valueOf("127")); //true ,object compare, because IntegerCache return a same object
    //    System.out.println(Integer.valueOf("128")==Integer.valueOf("128")); //false ,object compare, because number beyond the IntegerCache
    //    System.out.println(Integer.parseInt("128")==Integer.valueOf("128")); //true , int type compare
    //
    //}

    public static void main(String[] args) {
        String[] split = "0.1".split(".");
        System.out.println(split);
    }
}
