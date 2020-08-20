package com.sjzc.javaTest.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author zhaochong
 * @Description
 * //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * //
 * // 有效字符串需满足：
 * //
 * //
 * // 左括号必须用相同类型的右括号闭合。
 * // 左括号必须以正确的顺序闭合。
 * //
 * //
 * // 注意空字符串可被认为是有效字符串。
 * //
 * // 示例 1:
 * //
 * // 输入: "()"
 * //输出: true
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: "()[]{}"
 * //输出: true
 * //
 * //
 * // 示例 3:
 * //
 * // 输入: "(]"
 * //输出: false
 * //
 * //
 * // 示例 4:
 * //
 * // 输入: "([)]"
 * //输出: false
 * //
 * //
 * // 示例 5:
 * //
 * // 输入: "{[]}"
 * //输出: true
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0020 {
    /**
     * eg: (()())  ([)]
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> map = new HashMap();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                if (stack.size() == 0) {
                    return false;
                }
                char pop = stack.pop();
                if (pop != map.get(chars[i])) {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String s = "(()())";
        System.out.println(Solution0020.isValid(s));
        s= "([])[]";
        System.out.println(Solution0020.isValid(s));
        s= "(";
        System.out.println(Solution0020.isValid(s));
        s= ")";
        System.out.println(Solution0020.isValid(s));
    }
}


