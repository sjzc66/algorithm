package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 岛屿数量问题
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution0200 {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                    this.print(grid);
                }

            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        int x = grid.length;
        int y = grid[0].length;
        if (i < 0 || j < 0 || i >= x || j >= y || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
    }

    private void print(char[][] input) {
        System.out.println("---------------");
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        char[][] input = new char[4][5];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = '0';
            }
        }
        input[0][0] = '1';
        input[1][0] = '1';
        input[0][1] = '1';
        input[1][1] = '1';
        input[2][2] = '1';
        input[3][3] = '1';
        input[3][4] = '1';
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        Solution0200 solution0200 = new Solution0200();
        int i = solution0200.numIslands(input);
        System.out.println("--------");
        System.out.println(i);
    }
}


