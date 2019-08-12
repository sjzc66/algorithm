package com.sjzc.javaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 8:44 2019/3/10
 */
public class StringTest {
    //public static void main(String[] args) {
    //    long st = System.currentTimeMillis();
    //    String s = "";
    //    for (int i = 0; i < 10000; i++) {
    //        s += i;
    //    }
    //    long et = System.currentTimeMillis();
    //    System.out.println("执行时间：" + (et - st));
    //
    //
    //    st = System.currentTimeMillis();
    //    for (int i = 0; i < 10000; i++) {
    //        s = "1" + i + "3";
    //        s.intern();
    //    }
    //    et = System.currentTimeMillis();
    //    System.out.println("执行时间：" + (et - st));
    //
    //
    //    st = System.currentTimeMillis();
    //    StringBuffer sb = new StringBuffer();
    //    for (int i = 0; i < 100000; i++) {
    //        sb.append(i);
    //    }
    //    et = System.currentTimeMillis();
    //    System.out.println("执行时间：" + (et - st));
    //}

    public static void main(String[] args) {
        String s = "3";
        Long a = Long.valueOf(s);
        System.out.println(a);
        //System.arraycopy();
        List<Integer> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
        list.addAll(l);
        System.out.println(list.size());
        List list1 = Collections.synchronizedList(new ArrayList());
        Map<Class<? extends Map>, Map> map;
        System.out.println("");
    }

}
