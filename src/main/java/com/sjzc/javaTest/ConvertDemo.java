package com.sjzc.javaTest;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * 所有基础数据类型的转换
 */
public class ConvertDemo {

    /**
     * int 进行二进制打印
     * @param num
     */
    public static void printBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 字符数组  - String
        System.out.println("-------------字符数组  <-> String---------------");
        System.out.println("");
        char[] chars = {'a', 'b', 'c'};
        String s = String.valueOf(chars);
        System.out.println(s);
        chars = s.toCharArray();
        System.out.println(chars);

        // Integer数组 转 List
        System.out.println("-------------Integer数组 转 List---------------");
        Integer[] b = {1, 2, 3, 4, 5};
        List<Integer> bList = Arrays.asList(b);
        System.out.println(bList);
        Integer[] bb = bList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(bb));        // 打印Integer[]


        // 基本数据类型  数组 转 List
        // 先装箱，转换成包装类型数组，在去转换list
        System.out.println("-------------基本数据类型  数组 转 List---------------");
        int[] a = {1, 2, 3, 4, 5};
        Integer[] aa = Arrays.stream(a).boxed().toArray(Integer[]::new);
        List<Integer> aaa = Arrays.asList(aa);
        Integer[] aaaa = aaa.toArray(new Integer[0]);
        System.out.println(Arrays.toString(aaaa));

        System.out.println("-------------Integer[]  <--->  int[]-------JDK8以前--------");
        Integer[] c = {1, 2, 3, 4, 5, 6};
        // System.out.println(Arrays.toString(c));
        int[] cc = ArrayUtils.toPrimitive(c);
        // System.out.println(Arrays.toString(cc));
        Integer[] ccc = ArrayUtils.toObject(cc);
        // System.out.println(Arrays.toString(ccc));

        System.out.println("-------------Integer[]  <--->  int[]-------JDK8以后--------");
        Integer[] d = {5, 22, 3, 4, 5, 6};
        // System.out.println(Arrays.toString(d));
        int[] dd = Arrays.stream(d).mapToInt(Integer::valueOf).toArray();
        // System.out.println(Arrays.toString(dd));
        Integer[] ddd = Arrays.stream(dd).boxed().toArray(Integer[]::new);
        // System.out.println(Arrays.toString(ddd));


        System.out.println("--------------数组打印--------------");
        int[] e = {5, 2, 21, 354, 123};
        System.out.println(Arrays.toString(e));        // 打印int[]
        Integer[][] ee = {{0, 1}, {1, 1}};
        System.out.println(Arrays.deepToString(ee));     // 打印int[][]



        System.out.println("--------------List<基本数据类型>打印--------------");
        // TODO: 2022/7/19


        System.out.println("--------------collect操作--------------");
        List<Integer> f = Arrays.asList(1, 2, 3, 4, 5);

        Integer ff = f.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(ff);
        IntSummaryStatistics intSummaryStatistics = f.stream().mapToInt(Integer::valueOf).summaryStatistics();
        System.out.println(intSummaryStatistics.getSum());


    }
}
