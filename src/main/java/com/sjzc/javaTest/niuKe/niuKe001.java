package com.sjzc.javaTest.niuKe;

import java.util.Scanner;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-04-26 19:31
 **/
public class niuKe001 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     while (sc.hasNext()) {
    //         String s = sc.nextLine();
    //         char[] chars = s.toCharArray();
    //         int tailIndex = chars.length - 1;
    //         int count = 0;
    //         while (!Objects.equals(chars[tailIndex], ' ')) {
    //             tailIndex--;
    //             count++;
    //             if (tailIndex == -1) {
    //                 break;
    //             }
    //         }
    //         System.out.println(count);
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split("");
        System.out.println(split[split.length - 1].length());
    }
}
