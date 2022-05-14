package com.sjzc.javaTest.leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhaochong
 * @Description 691. 贴纸拼词   0000 1010
 *  tag 位运算 取最右侧1 1的个数
 * @create: 2022/5/14 上午11:14
 **/
public class Solution0691_2 {
    public int minStickers(String[] stickers, String target) {
        // 构建位运算表
        List<Integer> biao = new LinkedList<>();
        for (int i = 0; i < stickers.length; i++) {
            int construct = construct(stickers[i]);
            biao.add(construct);
        }
        int targetInt = construct(target);

        // 计算结果集，是否有不存在的字符
        int res = 0;
        for (int i = 0; i < biao.size() ;i++) {
            res |= biao.get(i);
        }
        int i = ~res & targetInt;
        if (i != 0) {
            return -1;
        }

        // 去除，根本没有可用字符的结果集
        removeInvalidString(biao, targetInt);

        //todo 1. 找肯定需要的
        // 怎么拼出来结果集
        // 不好做


        return 0;
    }

    // 移出 完全用不上的字符串
    private void removeInvalidString(List<Integer> biao, int targetInt) {
        Iterator<Integer> iterator = biao.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            int t = next & targetInt;
            if (t == 0) {
                iterator.remove();
            }
        }
    }

    // 构建位运算表
    private int construct(String string) {
        String sticker = string;
        char[] chars = sticker.toCharArray();
        int temp = 0;
        for (int i = 0; i < chars.length; i++) {
            int t = chars[i] - 'a';
            temp |= 1 << t;
        }
        return temp;
    }

    public static void main(String[] args) {
        String[] stickers = {"with", "example", "science","bc"};
        // String[] stickers = {"notice","possible"};
        String target = "thehat";
        // String target = "basicbasic";
        Solution0691_2 solution0691 = new Solution0691_2();
        int i = solution0691.minStickers(stickers, target);
        System.out.println(i);
    }
}
