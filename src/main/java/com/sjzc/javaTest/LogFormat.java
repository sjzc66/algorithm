package com.sjzc.javaTest;

/**
 * LogFormat实现log插值
 */
public class LogFormat {

    private final int INIT_SIZE = 2 << 3;

    private StringBuffer[] texts = new StringBuffer[INIT_SIZE];

    private int[] offsets = new int[INIT_SIZE];

    public static void main(String[] args) {
        LogInterpolator.interpolate3("{0}cd{1}f", "b", "e");
    }

    /**
     * 构造texts数组和offsets数组
     *
     * @param text
     */
    public LogFormat(String text) {
        int index = 0;
        int charContent = 0;   // 0 未知  1 刚才是符号  2 刚才不是符合
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch == '{') {
                index++;
                offsets[index] = 2;         //2
                charContent = 2;
            } else if (ch == '}') {
                index++;
                charContent = 1;
            } else {
                if (texts[index] == null) texts[index] = new StringBuffer();
                texts[index].append(ch);
                if (charContent == 0) {
                    offsets[index] = 1;
                }        //1
                if (charContent == 1) {
                    offsets[index] = 1;             //3
                    charContent = 2;
                }
            }

            if (index >= texts.length) {
                StringBuffer[] tempText = texts;
                texts = new StringBuffer[texts.length << 1];
                for (int j = 0; j < tempText.length; j++) {
                    texts[j] = tempText[j];
                }
                int[] tempOffSets = offsets;
                offsets = new int[offsets.length << 1];
                for (int j = 0; j < tempOffSets.length; j++) {
                    offsets[j] = tempOffSets[j];
                }
            }
        }
    }

    public String format(Object... args) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < texts.length; i++) {
            if (texts[i] != null) {
                if (offsets[i] == 1) {
                    sb.append(texts[i]);
                }
                if (offsets[i] == 2) {
                    if (Integer.parseInt(String.valueOf(texts[i])) < args.length) {
                        sb.append(args[Integer.parseInt(String.valueOf(texts[i]))]);
                    } else {
                        sb.append("{").append(Integer.parseInt(String.valueOf(texts[i]))).append("}");
                    }
                }
            }
        }
        return sb.toString();
    }

}
