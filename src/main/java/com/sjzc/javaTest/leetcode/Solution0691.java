package com.sjzc.javaTest.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhaochong
 * @Description 691. 贴纸拼词
 *  tag 位运算 取最右侧1 1的个数
 * @create: 2022/5/14 上午11:14
 **/
public class Solution0691 {
    public int minStickers(String[] stickers, String target) {
        List<int[]> bagList = new LinkedList<>();
        for (int i = 0; i < stickers.length; i++) {
            int[] single = construct(stickers[i]);
            bagList.add(single);
        }

        int[] aim = construct(target);
        // 用bagList 把aim 拼出来的最少数量
        if (allZero(aim)) return 0;
        // aim值肯定有内容
        // 缓存
        HashMap<String, Integer> dp = new HashMap<>();
        dp.put("", 0);
        int ans = minBag(bagList, aim, dp);
        return ans;
    }

    // index.. length
    private int minBag(List<int[]> bagList, int[] rest, HashMap<String, Integer> dp) {
        String cacheKey = getCacheKey(rest);
        if (dp.containsKey(cacheKey)) {
            return dp.get(cacheKey);
        }
        //  在选择 index 贴纸，没有用了 return 0
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < bagList.size(); i++) {
            if (huchi(rest, bagList.get(i))) {
                continue;
            }
            int[] newRest = div(rest, bagList.get(i));
            int count = minBag(bagList, newRest, dp);
            if (count != -1) {
                ans = Math.min(ans, count + 1);
            }
        }
        // ans 系统最大  rest
        dp.put(cacheKey, ans == Integer.MAX_VALUE ? -1 : ans);
        return dp.get(cacheKey);
    }


    private int[] div(int[] a, int[] b) {
        int[] newRest = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newRest[i] = Math.max((a[i] - b[i]), 0);
        }
        return newRest;
    }

    private boolean huchi(int[] a, int[] b) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[i] * b[i] != 0 ? 1 : 0;
        }
        return res == 0;
    }

    private boolean isFull(int[] a, int[] b, int count) {
        for (int i = 0; i < a.length; i++) {
            // 当前位置，剩余
            int restI = a[i] - b[i] * count;
            // b[i] == 0 不用考虑满没满
            if (b[i] == 0) {
                continue;
            }
            // b[i] != 0 需要考虑满没满
            if (restI > 0) {   // 没满
                return false;
            }

        }
        return true;
    }

    // true 全部小于等于0
    private boolean allLtAndEq(int[] intList) {
        boolean ans = true;
        for (int i = 0; i < intList.length; i++) {
            if (intList[i] > 0) {
                ans = false;
            }
        }
        return ans;
    }

    private boolean allZero(int[] intList) {
        boolean allZero = true;
        for (int i = 0; i < intList.length; i++) {
            if (intList[i] != 0) {
                allZero = false;
            }
        }
        return allZero;
    }

    private int[] construct(String string) {
        int[] array = new int[27];
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            array[chars[i] - 'a']++;
        }
        return array;
    }

    private String getCacheKey(int[] rest) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rest.length; i++) {
            int count = rest[i];
            while (count != 0) {
                sb.append((char)(i + 'a'));
                count--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // String[] stickers = {"with", "example", "science","bc"};
        // String[] stickers = {"notice","possible"};
        // String[] stickers = {"a","bbc","ab"};
        String[] stickers = {"aaa","b","c"};
        // String target = "thehat";
        // String target = "basicbasic";
        // String target = "bbcb";
        String target = "aaab";
        Solution0691 solution0691 = new Solution0691();
        int i = solution0691.minStickers(stickers, target);

        System.out.println(i);
    }
}
