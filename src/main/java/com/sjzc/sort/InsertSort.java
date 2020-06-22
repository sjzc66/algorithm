package com.sjzc.sort;

import java.util.Arrays;

/**
 * @author sjzc
 * @Description: 直接插入排序
 * @Date: Created in 14:40 2018/7/18
 */
public class InsertSort extends SortUtil {
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


    public void executeZuo(Integer[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0 && array[j] > array[j + 1]; j--) {
                swap(array, j, j + 1);
            }
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

    public static void main(String[] args) {
        Integer[] nums = {1, 3, 2, 5, 6, 3, 6, 2, 8, 6, 9};
        System.out.println(Arrays.toString(nums));
        SortUtil.insertSort.executeZuo(nums);
        System.out.println(Arrays.toString(nums));
        ;
    }
}
