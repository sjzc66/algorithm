package com.sjzc.javaTest.leetcode;

import java.util.HashMap;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 9:35 2019/6/3
 */
public class AdvanceAISolution {

    public String store(HashMap[] maps) {
        StringBuilder rtn = new StringBuilder();
        for (int i = 0; i < maps.length; i++) {
            if (maps[i] == null) continue;
            if (i>0) rtn.append("\\n");
            for (Object key : maps[i].keySet()) {
                rtn.append(key).append("=").append(maps[i].get(key)).append(";");
            }
            rtn.deleteCharAt(rtn.length() - 1);

        }
        return rtn.toString();
    }

    /**
     * k1=v1;k2=v2\nA=a load
     * @param text
     * @return
     */
    public HashMap[] load(String text) {
        HashMap[] rtn = new HashMap[2];
        int mapIndex = 0;
        boolean isKey = true;
        StringBuilder key = new StringBuilder();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (isKey ==true) key.append(c);
            if (isKey == false) value.append(c);
            if (c == '=') isKey = false;
            if (c == ';') {
                if (rtn[mapIndex] == null) rtn[mapIndex] = new HashMap();
                rtn[mapIndex].put(key, value.deleteCharAt(value.length()-1));
                isKey = true;
                key = new StringBuilder();
                value = new StringBuilder();
            }
            if (c == '\\') {
                if ((c = text.charAt(++i)) == 'n') {
                    if (rtn[mapIndex] == null) rtn[mapIndex] = new HashMap();
                    rtn[mapIndex].put(key, value.deleteCharAt(value.length()-1));
                    isKey = true;
                    key = new StringBuilder();
                    value = new StringBuilder();
                    mapIndex++;
                }
            }
        }
        if (rtn[mapIndex] == null) rtn[mapIndex] = new HashMap();
        rtn[mapIndex].put(key.toString(), value.toString());
        return rtn;
    }

    public static void main(String[] args) {
        HashMap[] map = new HashMap[2];
        map[0] = new HashMap();
        map[0].put("k1", "v1");
        map[0].put("k2", "v2");
        map[1] = new HashMap();
        map[1].put("A", "a");
        AdvanceAISolution aiSolution = new AdvanceAISolution();
        String store = aiSolution.store(map);
        System.out.println(store);
        HashMap[] load = aiSolution.load(store);
        System.out.println(load);
    }
}
