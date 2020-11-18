package com.sjzc.javaTest.leetcode;

/**
 * @author sjzc
 * @Description:
 * //给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * //
 * // 示例 1:
 * //
 * //
 * //输入: "abab"
 * //
 * //输出: True
 * //
 * //解释: 可由子字符串 "ab" 重复两次构成。
 * //
 * //
 * // 示例 2:
 * //
 * //
 * //输入: "aba"
 * //
 * //输出: False
 * //
 * //
 * // 示例 3:
 * //
 * //
 * //输入: "abcabcabcabc"
 * //
 * //输出: True
 * //
 * //解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0459 {
    public static boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }
    public static void main(String[] args) {
        String a = "aba";
        boolean b = Solution0459.repeatedSubstringPattern(a);
        System.out.println(b);
    }
}