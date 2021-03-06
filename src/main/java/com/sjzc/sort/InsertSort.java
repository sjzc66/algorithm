package com.sjzc.sort;

/**
 * @author sjzc
 * @Description: 直接插入排序
 * @Date: Created in 14:40 2018/7/18
 */
public class InsertSort extends SortUtil{
    public void execute(Integer[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0 && tmp < array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = tmp;
        }
    }

    public void execute(Integer[] array, int start, int end) {
        int endIndex = end + 1;
        for (int i = start; i < endIndex; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= start && tmp < array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = tmp;
        }
    }
}
