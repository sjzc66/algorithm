package com.sjzc.javaTest;

public class StringFUtil {

    private String text;

    private int offsite;

    private StringBuffer[] texts = new StringBuffer[10];

    private int[] offsets = new int[10];

//    // 默认字符为
//    public StringFUtil(String text) {
//        int j = 0;
////        int k = 0;
//        boolean isInner = false;
//        for (int i = 0; i < text.length(); ++i) {
//            char ch = text.charAt(i);
//            if (ch == '{') {
////                offsets[k] = 1;
//                j++;
//                offsets[j] = 1;
//                isInner = true;
////                k++;
//            } else if (ch == '}') {
////                offsets[k] = 1;
//                if (isInner == false) {
//                    j++;
//                }
//                offsets[j] = 1;
//                isInner = false;
////                k++;
//            } else {
//                if (texts[j] == null) texts[j] = new StringBuffer();
//                texts[j].append(ch);
//                if (isInner == false) {
//                    offsets[j] = 0;
//                }
//                if (isInner == true) {
//                    j++;
//                }
////                offsets[k] = 0;
////                k++;
//            }
//        }
//        this.text = text;
//    }


//    // 默认字符为
//    public StringFUtil(String text) {
//        int j = 0;
//        int isContent = 0;          // 0 未知  1 是内容  2是符号
//        for (int i = 0; i < text.length(); ++i) {
//            char ch = text.charAt(i);
//            if (ch == '{') {
//                if (isContent == 1) {
//                    offsets[j] = 1;
//                }
//                j++;
//                isContent = 2;
//            } else if (ch == '}') {
//                j++;
//            } else {
//                if (texts[j] == null) texts[j] = new StringBuffer();
//                texts[j].append(ch);
//                if (isContent == 2) {
//                    offsets[j] = 2;
//                }
//                isContent = 1;
//            }
//        }
//        this.text = text;
//    }

//    // 默认字符为
//    public StringFUtil(String text) {
//        int j = 0;
//        boolean isInner = false;
//        int isContent = 0;          // 0 未知  1 是内容  2是符号
//        for (int i = 0; i < text.length(); ++i) {
//            char ch = text.charAt(i);
//            if (ch == '{') {
//                j++;
//                isContent = 2;
//                isInner = true;
//            } else if (ch == '}') {
//                j++;
//                isContent = 2;
//                isInner = false;
//            } else {
//                if (texts[j] == null) texts[j] = new StringBuffer();
//                texts[j].append(ch);
//                isContent = 1;
//            }
//            if (isContent == 0) {
//                offsets[j] = 1;
//            }
//            if (isContent == 1 && isInner == false) {
//                offsets[j] = 1;
//            }
//            if (isContent == 2) {
//                offsets[j] = 2;
//            }
//        }
//        this.text = text;
//    }

    // 默认字符为
    public StringFUtil(String text) {
        int j = 0;
        int just_is_fuhao = 0;   // 0 未知  1 刚才是符号  2 刚才不是符合
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch == '{') {
                j++;
                offsets[j] = 2;         //2
                just_is_fuhao = 2;
            } else if (ch == '}') {
                j++;
                just_is_fuhao = 1;
            } else {
                if (texts[j] == null) texts[j] = new StringBuffer();
                texts[j].append(ch);
                if (just_is_fuhao == 0) {
                    offsets[j] = 1;
                }        //1
                if (just_is_fuhao==1) {
                    offsets[j] = 1;             //3
                    just_is_fuhao = 2;
                }
            }
        }
        this.text = text;
    }

    public String format(Object ... args) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < texts.length; i++) {
            if (texts[i] != null) {
                if (offsets[i] == 1) {
                    sb.append(texts[i]);
                }
                if (offsets[i] == 2) {
                    sb.append(args[Integer.parseInt(String.valueOf(texts[i]))]);
                }
            }
        }
        return sb.toString();
    }

}
