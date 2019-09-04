package com.sjzc.javaTest.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhaochong
 * @Description
 * @create: 2019-08-21 15:55
 **/
public class BigdecimalQuestion {
    public static void main(String[] args) {
        X x1 = new X(1, 2);
        intVo vo1 = new intVo(0,x1);
        X x2 = new X(3, 4);
        intVo vo2 = new intVo(0, x2);
        X x3 = new X(2, 1);
        intVo vo3 = new intVo(0, x3);

        List<intVo> list = new ArrayList<>();
        list.add(vo1);
        list.add(vo2);
        list.add(vo3);

        Integer s1 = list.stream().map(intVo::getX).collect(Collectors.summingInt(X::getA));
        System.out.println(s1);
        Integer s2 = list.stream().map(intVo::getX).collect(Collectors.summingInt(X::getB));
        System.out.println(s2);

        int s3 = list.stream().map(intVo::getX).mapToInt(X::getA).sum();
        System.out.println(s3);
        int s4 = list.stream().map(intVo::getX).mapToInt(X::getB).sum();
        System.out.println(s4);

        BigDecimal bigDecimal = new BigDecimal(new Double(4.6));
        Double aDouble = new Double("4.6");
        System.out.println(aDouble);

    }
}

class intVo{
    private int aInt;
    private X x;

    public intVo(int aInt,X x) {
        this.aInt = aInt;
        this.x = x;
    }

    public int getaInt() {
        return aInt;
    }

    public void setaInt(int aInt) {
        this.aInt = aInt;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }
}

class X{
    private int a;
    private int b;

    public X(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

