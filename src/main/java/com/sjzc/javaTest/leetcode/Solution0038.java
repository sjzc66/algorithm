package com.sjzc.javaTest.leetcode;

/**
 * @author sjzc
 * @Description: 
 *    给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。 
 *    
 *     注意：整数序列中的每一项将表示为一个字符串。 
 *    
 *     「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下： 
 *    
 *     1.     1
 *    2.     11
 *    3.     21
 *    4.     1211
 *    5.     111221
 *     
 *    
 *     第一项是数字 1 
 *    
 *     描述前一项，这个数是 1 即 “一个 1 ”，记作 11 
 *    
 *     描述前一项，这个数是 11 即 “两个 1 ” ，记作 21 
 *    
 *     描述前一项，这个数是 21 即 “一个 2 一个 1 ” ，记作 1211 
 *    
 *     描述前一项，这个数是 1211 即 “一个 1 一个 2 两个 1 ” ，记作 111221 
 *    
 *     
 *    
 *     示例 1: 
 *    
 *     输入: 1
 *    输出: "1"
 *    解释：这是一个基本样例。 
 *    
 *     示例 2: 
 *    
 *     输入: 4
 *    输出: "1211"
 *    解释：当 n = 3 时，序列是 "21"，其中我们有 "2" 和 "1" 两组，"2" 可以读作 "12"，也就是出现频次 = 1 而 值 = 2；类似 
 *    "1" 可以读作 "11"。所以答案是 "12" 和 "11" 组合在一起，也就是 "1211"。 
 * @Date: Created in 22:02 2019/4/6
 */
public class Solution0038 {

    public static String countAndSay(int n) {
        if (n==1) return "1";
        // if (n==2) return "11";
        // if (n==3) return "21";
        // if (n==4) return "1211";
        // if (n==5) return "111221";

        String start = countAndSay(n - 1);
        char[] chars = start.toCharArray();
        StringBuilder end = new StringBuilder();

        int count = 0;
        Character current = 'a';
        Character next = 'b';
        for (int i = 0; i < chars.length; i++) {
            next = chars[i];
            if (current == next) {
                count++;
                continue;
            }
            if (count > 0) {
                end.append(count).append(current - '0');
            }
            current = next;
            next = null;
            count = 1;
        }
        if (count > 0) {
            end.append(count).append(current - '0');
            count = 0;
        }
        return end.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
        System.out.println(countAndSay(7));
        System.out.println(countAndSay(8));
        System.out.println(countAndSay(9));
        System.out.println(countAndSay(10));
    }


    class Solution {
        public String countAndSay(int n) {
            if (n == 1) {
                return "1";
            }
            StringBuffer res = new StringBuffer();
            String str = countAndSay(n - 1);
            int length = str.length();
            int a = 0;
            for (int i = 1; i < length + 1; i++) {
                if (i == length) {
                    return res.append(i - a).append(str.charAt(a)).toString();
                } else if (str.charAt(i) != str.charAt(a) ) {
                    res.append(i - a).append(str.charAt(a));
                    a = i;
                }
            }
            return res.toString();
        }
    }
}