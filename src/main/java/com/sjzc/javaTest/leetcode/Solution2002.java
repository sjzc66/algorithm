package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 面试题10- II. 青蛙跳台阶问题
 * @create: 2020-04-26 20:13
 **/
public class Solution2002 {

    /**
     * n！ 不可取的方案
     * @param n
     * @return
     */
    // public int numWays(int n) {
    //     if (n == 0) return 0;
    //     if (n == 1) return 1;
    //     if (n == 2) return 2;
    //     int result = numWays(n - 1) + numWays(n - 2);
    //     int rtn = (int) (result % (1e9 + 7));
    //     return rtn;
    // }

    public int numWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        int left = 1;
        int right = 1;
        int result = -1;
        for (int i = 2; i <= n; i++) {
            result = left + right;
            result = (int) (result % (1e9 + 7));
            left = right;
            right = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int input = 100;
        Solution2002 solution2001 = new Solution2002();
        int i = solution2001.numWays(input);
        System.out.println(i);
    }
}
