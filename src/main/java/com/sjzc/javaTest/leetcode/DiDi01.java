package com.sjzc.javaTest.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sjzc
 * @Description: 输入string
 * @Date: Created in 22:02 2019/4/6
 */
public class DiDi01 {
    public int solution(String string) throws Exception {
        int result = 0;
        String valueString = "";
        char[] chars = string.toCharArray();
        if (chars.length == 0) {
            return 0;
        }
        //是否有符号
        boolean hasFlag = false;
        //是否是正数
        boolean flag = true;
        //是否为数字
        boolean isNumber = true;
        //符号判断
        if (chars[0] == '+') {
            hasFlag = true;
        }
        if (chars[0] == '-') {
            hasFlag = true;
            flag = false;
        }
        //确保是一个数字
        for (int i = 0; i < chars.length; i++) {
            if (hasFlag && i == 0) {
                continue;
            }
            List<Integer> objects = Collections.synchronizedList(new LinkedList<Integer>());
            objects.add(1);
            if (!((chars[i] - '0') >= 0 && (chars[i] - '0') <= 10)) {
                isNumber = false;
            }
        }
        if (hasFlag) {
            valueString = string.substring(1, chars.length);
        }
        if (isNumber) {
            int length = valueString.length();
            char[] valueChars = valueString.toCharArray();
            for (int i = 0; i < length; i++) {
                int current = (valueChars[i] - '0');
                for (int j = i; j < length - 1; j++) {
                    current *= 10;
                }
                result += current;
                //超范围处理
                if (current > (Integer.MAX_VALUE - result)) {
                    throw new Exception();
                }
            }
            return flag ? result : 0 - result;
        }
        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        DiDi01 test01 = new DiDi01();
        int solution = test01.solution("-123123121241423142341");
        System.out.println(solution);
    }

}