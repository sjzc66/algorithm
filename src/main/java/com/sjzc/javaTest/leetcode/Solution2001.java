package com.sjzc.javaTest.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochong
 * @Description string组合的全排列问题
 * @create: 2020-04-26 20:13
 **/
public class Solution2001 {

    public String[] permutation(String S) {
        if (S.length() < 1 || S.length() > 9) {
            return null;
        }
        Object[] objects = sss(S).toArray();
        String[] result = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            result[i] = (String) objects[i];
        }
        return result;
    }

    public List<String> sss(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() == 1) {
            List one = new ArrayList<>();
            one.add(s);
            return one;
        }
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            StringBuffer sb = new StringBuffer();
            StringBuffer other = sb.append(s.substring(0, i)).append(s.substring(i + 1, s.length()));
            List<String> sss = sss(other.toString());
            for (int j = 0; j < sss.size(); j++) {
                result.add(new StringBuilder().append(c).append(sss.get(j)).toString());
            }
        }
        return result;
    }

    // public List<String> sss(String s) {
    //     List<String> result = new ArrayList<>();
    //     if (s.length() == 1) {
    //         List one = new ArrayList<>();
    //         one.add(s);
    //         return one;
    //     }
    //     for (int i = 0; i < s.length(); i++) {
    //         char c = s.charAt(i);
    //         // String replace = s.replace(c, '');
    //
    //     }
    //     return result;
    // }

    public static void main(String[] args) {
        String inputString = "qwe";
        Solution2001 solution2001 = new Solution2001();
        String[] permutation = solution2001.permutation(inputString);
        System.out.println(permutation.toString());
    }
}
