package com.sjzc.javaTest.practice.interview;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhaochong
 * @Description 子序列 排列
 * @create: 2022/5/12 下午12:14
 **/
public class SubSequences {

    public static List<String> allSubSequence(String string) {
        char[] chars = string.toCharArray();

        // List<String> res = process(chars, 0, string.length() - 1);
        List<String> res = new LinkedList<>();
        process2(chars, 0, res, "");
        return res;
    }

    private static List<String> process(char[] chars,int l, int r) {
        List<String> result = new LinkedList<>();
        if (l >= chars.length) {
            return result;
        }
        if (l == r) {
            result.add(String.valueOf(chars[l]));
            result.add("");
            return result;
        }
        int cur = l;
        List<String> processList = process(chars, l + 1, chars.length - 1);
        for (String process : processList) {
            result.add(process);
            result.add(chars[cur] + process);
        }
        return result;
    }

    private static void process2(char[] chars, int index, List<String> res, String path) {
        if (index == chars.length) {
            res.add(path);
            return;
        }
        String no = path;
        process2(chars, index + 1, res, no);
        String yes = path + chars[index];
        process2(chars, index + 1, res, yes);
    }


    public static void main(String[] args) {
        List<String> abc = SubSequences.allSubSequence("abcd");
        abc.size();
    }
}
