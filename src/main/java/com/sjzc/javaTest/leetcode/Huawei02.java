package com.sjzc.javaTest.leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-04-25 09:37
 **/
public class Huawei02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Set set = new HashSet();
            StringBuffer stringBuffer = new StringBuffer();
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            int size = chars.length;
            if (chars.length > 99) {
                size = 100;
            }
            for (int i = 0; i < size; i++) {
                if (set.add(chars[i])) {
                    stringBuffer.append(chars[i]);
                }
            }
            System.out.println(stringBuffer.toString());
        }
    }
}
