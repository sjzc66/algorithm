package com.sjzc.javaTest.practice.interview;

/**
 * @author zhaochong
 * @Description 一次编辑
 * @create: 2022/5/12 下午12:14
 **/
public class OneEdit {

    public boolean oneEditAway(String first, String second) {
        boolean a = oneAddOrDeleteIsOk(first, second);
        boolean b = oneReplaceIsOk(first, second);
        return a || b;
    }

    private boolean oneAddOrDeleteIsOk(String content, String target) {
        String max = content.length() > target.length() ? content : target;
        String min = content.equals(max) ? target : content;
        if (max.length() != min.length() + 1 ) {
            return false;
        }
        if (max.contains(min)) {
            return true;
        }
        int result = 0;
        int l = 0;
        int r = 0;
        while (l < max.length() && r < max.length()) {
            if (max.charAt(l) - min.charAt(r) != 0) {
                l++;
                result++;
                continue;
            }
            l++;
            r++;
        }
        return result == 1;
    }

    private boolean oneReplaceIsOk(String content, String target) {
        if (content.equals(target)) {
            return true;
        }
        if (content.length() != target.length()) {
            return false;
        }
        int result = 0;
        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) != target.charAt(i)) {
                result++;
            }
        }
        return result == 1;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcff";
        OneEdit oneEdit = new OneEdit();
        boolean res = oneEdit.oneEditAway(a, b);
        System.out.println(res);
    }
}
