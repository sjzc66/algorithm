package com.sjzc.javaTest.leetcode;

/**
 * @author sjzc
 * @Description: 小鸟高的面试题
 * @Date: Created in 14:58 2019/6/5
 */
public class XiaoNianGao {
    /**
     *
     * @param v1 版本号1
     * @param v2 版本号2
     * @return 版本号1>版本号2 返回1
     *          版本号1<版本号2 返回-1
     *          版本号1<版本号2 相等返回0
     *          版本号异常throwBussinessException
     */
    public int compareVersion(String v1, String v2) throws Exception {
        int rtn = 0;
        String regexZS = "[0-9A-Za-z.]+";
        if (!v1.matches(regexZS)) throw new Exception("版本号异常");
        if (!v2.matches(regexZS)) throw new Exception("版本号异常");
        int size = v1.length();
        if (size<v2.length()) size = v2.length();
        for (int i = 0; i < size; i++) {
            int c1 = (int)v1.charAt(i);
            int c2 = (int)v2.charAt(i);
            if (c1==c2) continue;
            if (c1>c2){
                rtn = 1;
                break;
            }
            if (c1<c2) {
                rtn = 2;
                break;
            }
        }
        return rtn;
    }

    public static void main(String[] args) throws Exception {
        XiaoNianGao x =new XiaoNianGao();
        int i = x.compareVersion("1.2.3b", "1.2.3a");
        System.out.println(i);
    }
}
