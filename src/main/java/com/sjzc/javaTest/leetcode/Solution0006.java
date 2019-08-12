package com.sjzc.javaTest.leetcode;

import java.util.Objects;

/**
 * @author sjzc
 * @Description: 整数反转
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0006 {
    //给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
    //示例 1:
    //输入: 123
    //输出: 321
    //示例 2:
    //输入: -123
    //输出: -321
    //示例 3:
    //输入: 120
    //输出: 21
    public int reverse(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        boolean zhengshu = true;
        boolean mowei = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Objects.equals(s.charAt(i), "0".charAt(0)) && mowei) {
                continue;
            }
            mowei = false;
            if (Objects.equals(s.charAt(i), "-".charAt(0))) {
                zhengshu = false;
                break;
            }
            sb.append(s.charAt(i));
        }
        if (Objects.equals(sb.toString(), "")) {
            return 0;
        }
        try {
            if (zhengshu) {
                return Integer.valueOf(sb.toString());
            } else {
                return Integer.valueOf(("-" + sb.toString()));
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution0006 s = new Solution0006();
        int x = 123;
        int y = s.reverse(x);
        System.out.println(y);

        x = -123;
        y = s.reverse(x);
        System.out.println(y);

        x = 2147483647;
        y = s.reverse(x);
        System.out.println(y);

        x = 901000;
        y = s.reverse(x);
        System.out.println(y);
    }
}