package com.sjzc.javaTest.leetcode;

import java.util.Scanner;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-04-25 09:37
 **/
public class Huawei03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = 0;
        while (sc.hasNext()) {
            ShuDu shuDu = new ShuDu();
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            if (s1.length != 9) {
                System.out.println("每行必须有9个数字,重新输入");
                continue;
            }
            for (int i = 0; i < 10; i++) {
                shuDu.setLine(line,s1);
            }
            line++;
            if (line == 9) {
                line = 0;
                System.out.println("9行了");
                if (shuDu.isShuDu()) {
                    System.out.println("是一个数独");
                    shuDu.print();
                }else {
                    System.out.println("不是一个数独");
                }
            }
        }
    }
}

class ShuDu{
    public int[][] matrix = new int[9][9];

    public void setLine(int line,String[] input) {
        for (int i = 0; i < 9; i++) {
            matrix[line][i] = Integer.parseInt(input[i]);
        }
    }

    public boolean isShuDu(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // matrix[i][j];
            }
        }
        return true;
    }
    public void print(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
