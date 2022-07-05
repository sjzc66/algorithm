package com.sjzc.javaTest.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhaochong
 * @Description 给你个整数数组 arr，其中每个元素都 不相同。
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 * // 示例 1：
 * // 输入：arr = [4,2,1,3]
 * //输出：[[1,2],[2,3],[3,4]]
 * // 示例 2：
 * // 输入：arr = [1,3,6,10,15]
 * //输出：[[1,3]]
 * // 示例 3：
 * // 输入：arr = [3,8,-10,23,19,-4,-14,27]
 * //输出：[[-14,-10],[19,23],[23,27]]
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // 4 2 1 3  arr
        // 1 2 3 4  indexArr
        // 1 1 1 +  temp
        int[] indexArr = arr.clone();
        int[] tempArr = arr.clone();
        Arrays.sort(indexArr);
        Arrays.sort(tempArr);

//        dddd
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tempArr.length - 1; i++) {
            tempArr[i] = tempArr[i + 1] - tempArr[i];
            min = Math.min(min, tempArr[i]);
        }
        tempArr[arr.length - 1] = Integer.MAX_VALUE;

        List<List<Integer>> ans = new ArrayList<>();
        // 取最小的结果集
        for (int i = 0; i < tempArr.length - 1; i++) {
            if (tempArr[i] == min) {
                List<Integer> temp = Arrays.asList(indexArr[i], indexArr[i + 1]);
                ans.add(temp);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{4, 2, 1, 3};
        int[] arr = new int[]{1, 3, 6, 10, 15};
//        int[] arr = new int[]{3,8,-10,23,19,-4,-14,27};
        Solution1200 solution1200 = new Solution1200();
        List<List<Integer>> lists = solution1200.minimumAbsDifference(arr);
        System.out.println(lists.size());

    }
}


