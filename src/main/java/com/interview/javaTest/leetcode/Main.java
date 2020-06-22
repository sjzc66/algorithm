package com.interview.javaTest.leetcode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-05-06 21:56:19
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //行数
        HashMap<String, String> map = new HashMap();
        for (int i = 0; i < n-1; i++) {
            String s = sc.next();
            String[] split = s.split("=");
            if (split.length != 2) return;
            map.put(split[0], split[1]);
        }
        String lastString = sc.next();
        String[] split = lastString.split("=");
        if (split.length != 2) return;
        String s = split[1];
        String result = replace(s, map);
        System.out.println(result);
    }

    public static String replace(String str, HashMap<String, String> map) {
        if(str == null || str == "") return "";
        StringBuilder sb = new StringBuilder();
        str.toCharArray();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '$') {
                StringBuilder temp = new StringBuilder();
                int j = i + 2;
                if (j >= chars.length - 1) break;
                while (chars[j] != '}') {
                    temp.append(chars[j]);
                    j++;
                }
                sb.append(replace(map.get(temp.toString()), map));
                i = j;
                continue;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
