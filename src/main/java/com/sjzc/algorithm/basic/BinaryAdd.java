package com.sjzc.algorithm.basic;

/**
 * @author zhaochong
 * @Description 二进制求和
 * @create: 2020/6/22 1:45 下午
 **/
public class BinaryAdd {


    public String addBinary(String a, String b) {
        char[] l = a.toCharArray();
        char[] r = b.toCharArray();
        int p1 = l.length - 1;
        int p2 = l.length - 1;
        int max = l.length > r.length ? p1 : p2;
        char[] res = new char[max + 1];
        while (max > 0) {
            int jinwei = l[p1] & r[p2] - '0';
            res[max--] = (l[p1] ^ r[p2]) == 1 ? '1' : '0';

            max--;
        }
        return "";
    }


    public static void main(String[] args) {
        String a = "1001";
        String b = "0111";
        BinaryAdd s = new BinaryAdd();
        System.out.println(s.addBinary(a, b));

        System.out.println(0&0);
        System.out.println(1&0);
        System.out.println(0&1);
        System.out.println(1&1);
    }
}
