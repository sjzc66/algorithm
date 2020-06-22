package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 铺瓷砖-----
 * <p>
 * Solution0160
 * @create: 2020-04-26 20:13
 **/
public class Solution1240 {

    public int tilingRectangle(int n, int m) {
        if (n > m) {
            return tilingRectangle(m, n);
        }
        if (n == m) {
            return 1;
        }
        return tilingRectangle(n, m - n) + 1;
    }

    public static void main(String[] args) {
        Solution1240 solution = new Solution1240();
        System.out.println(solution.tilingRectangle(2, 3));
        System.out.println(solution.tilingRectangle(5, 8));
        System.out.println(solution.tilingRectangle(11, 13));
    }


}

