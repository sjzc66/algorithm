package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description  三角形最大面积
 * @create: 2022/5/15 上午11:58
 **/
public class Solution0812 {
    public double largestTriangleArea(int[][] points) {
        if (points.length < 3) {
            return 0.0;
        }
        double ans = 0.0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    ans = Math.max(ans, triangleArea(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1]));
                }
            }
        }
        return 0.0;
    }

    // 三角形 面积公式
    public double triangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5 * Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2);
    }

    private double distance(int[] x, int[] y) {
        if (invalid(x) || invalid(y)) {
            return 0.0;
        }
        double xDis = Math.pow(x[0] - y[0], 2);
        double yDis = Math.pow(x[1] + y[1], 2);
        double xyDis = Math.sqrt(xDis + yDis);
        return xyDis;
    }

    private boolean invalid(int[] t) {
        if (t.length != 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        Solution0812 solution0812 = new Solution0812();
        double v = solution0812.largestTriangleArea(points);
        System.out.println(v);


        int[] a = {2, 0};
        int[] b = {0, 2};
        double distance = solution0812.distance(a, b);
        System.out.println(distance);
    }
}
