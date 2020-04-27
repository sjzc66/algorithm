package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 无重复字符的最长子串
 *               最长不含重复字符的子字符串
 * @create: 2019-07-08 16:46
 **/
public class Solution0003 {

    public int lengthOfLongestSubstring(String s) {
        String rtn = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            int index = rtn.indexOf(t);
            if (index >= 0) {
                rtn = rtn.substring(index + 1);
            }
            rtn += t;
            if (rtn.length() > max) {
                max = rtn.length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution0003 s = new Solution0003();
        int len = s.lengthOfLongestSubstring("pwwkew");
        System.out.println(len);
    }
}
