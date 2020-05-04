package com.sjzc.javaTest.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaochong
 * @Description 无重复字符的最长子串
 * 最长不含重复字符的子字符串
 * @create: 2019-07-08 16:46
 **/
public class Solution0003_another {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        char[] chars = s.toCharArray();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean add = true;
            add = set.add(chars[i]);
            while (add == false) {
                set.remove(s.charAt(index++));
                add = set.add(chars[i]);
            }
            int current = (i - index + 1);
            result = result > current ? result : current;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution0003_another s = new Solution0003_another();
        int len = s.lengthOfLongestSubstring("pwwkew");
        System.out.println(len);
    }
}
