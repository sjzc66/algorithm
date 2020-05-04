package com.sjzc.javaTest.leetcode;

import org.checkerframework.checker.units.qual.s;

/**
 * @author zhaochong
 * @Description 扑克牌中的顺子
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0202 {

    public boolean isHappy(int n) {
        return isHappy(n,100);
    }

    public boolean isHappy(int n, int count) {
        if (count <= 0) {
            return false;
        }
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        if (chars.length == 1) {
            int result = chars[0] - '0';
            if (result == 1) {
                return true;
            }
        }
        int nextN = 0;
        for (int i = 0; i < chars.length; i++) {
            int ss = chars[i] - '0';
            nextN = nextN + ss * ss;
        }
        return isHappy(nextN, count - 1);
    }

    public static void main(String[] args) {
        int num = 29;
        Solution0202 solution0202 = new Solution0202();
        boolean straight = solution0202.isHappy(num);
        System.out.println(straight);
    }
}


