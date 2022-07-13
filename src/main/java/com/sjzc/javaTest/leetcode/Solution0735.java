package com.sjzc.javaTest.leetcode;

//给定一个整数数组 asteroids，表示在同一行的行星。
//
// 对于数组中的每一个元素，其绝对值表示行星的大小，正负表示行星的移动方向（正表示向右移动，负表示向左移动）。每一颗行星以相同的速度移动。
//
// 找出碰撞后剩下的所有行星。碰撞规则：两个行星相互碰撞，较小的行星会爆炸。如果两颗行星大小相同，则两颗行星都会爆炸。两颗移动方向相同的行星，永远不会发生碰撞
//。
//
//
//
// 示例 1：
//
//
//输入：asteroids = [5,10,-5]
//输出：[5,10]
//解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。
//
// 示例 2：
//
//
//输入：asteroids = [8,-8]
//输出：[]
//解释：8 和 -8 碰撞后，两者都发生爆炸。
//
// 示例 3：
//
//
//输入：asteroids = [10,2,-5]
//输出：[10]
//解释：2 和 -5 发生碰撞后剩下 -5 。10 和 -5 发生碰撞后剩下 10 。
//
//
//
// 提示：
//
//
// 2 <= asteroids.length <= 10⁴
// -1000 <= asteroids[i] <= 1000
// asteroids[i] != 0
//
// Related Topics 栈 数组 👍 310 👎 0


import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//leetcode submit region begin(Prohibit modification and deletion)
public class Solution0735 {

    // jdk 11  的问题吗？

    public int[] asteroidCollision2(int[] arr) {
        List<Integer> list = CollectionUtils.arrayToList(arr);
        // List<Integer> list = Arrays.stream(arr).collect(Collectors.toList());
        // List<Integer> list = new ArrayList<>(Arrays.asList(arr));


        return null;
    }

    //region 非常垃圾的写法

    public int[] asteroidCollision(int[] arr) {
        // [10,2,-5]
        // [ x l  r]
        if (arr.length < 2) {
            // 个数小于2，无需处理
            return arr;
        }
        int l = 0;
        int r = 1;
        int indexUpper = arr.length;

        while (l != r && l < indexUpper && r < indexUpper && l >= 0 && r >= 0) {
            if (arr[l] * arr[r] > 0) {
                //表示同方向
                l++;
                r++;
                continue;
            }
            //方向相反，需要碰撞
            // if (Math.abs(arr[l]) > Math.abs(arr[r])) {
            //     // 方向相反，不一定碰撞。。
            //     arr[r] = 0;
            //     r++;
            //     continue;
            // }

            if (arr[l] > 0 && arr[r] < 0) {
                arr[r] = 0;
                r++;
                continue;
            }

            if ((arr[l] < 0 && arr[r] > 0) ||
                    (arr[l] > 0 && arr[r] > 0) ||
                    (arr[l] < 0 && arr[r] < 0)) {
                //肯定不会碰撞的情况
                l++;
                r++;
                continue;
            }


            if (Math.abs(arr[l]) < Math.abs(arr[r])) {
                arr[l] = 0;
                l--;
                continue;
            }

            if (Math.abs(arr[l]) == Math.abs(arr[r])) {
                arr[l] = 0;
                arr[r] = 0;
                l--;
                r++;
                continue;
            }
        }
        int [] ans = removeZero(arr);
        return ans;
    }

    private int[] removeZero(int[] arr) {
        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                ansList.add(arr[i]);
            }
        }
        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = {8, -8};
        // int[] arr = {10, 2, -5};
        int[] arr = {-2,-1,1,2};
        Solution0735 solution0735 = new Solution0735();
        int[] ints = solution0735.asteroidCollision(arr);
        System.out.println(Arrays.toString(ints));
    }

    //endregion
}
//leetcode submit region end(Prohibit modification and deletion)
