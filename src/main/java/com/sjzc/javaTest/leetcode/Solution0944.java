package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 944. 删列造序
 * Solution0933
 * @create: 2022-05-12 00:23:20
 **/
public class Solution0944 {

    public int minDeletionSize(String[] strs) {
        int result = 0;
        int rows = strs.length;
        int cols = strs[0].length();
        for (int j = 0; j < cols; j++) {
            for (int i = 1; i < rows; i++) {
                if (strs[i].charAt(j) < strs[i-1].charAt(j)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"zyx", "wvu", "tsr"};
        Solution0944 solution0944 = new Solution0944();
        int i = solution0944.minDeletionSize(strings);
        System.out.println(i);
    }
}




