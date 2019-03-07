package com.sjzc.sort;

import java.util.Random;
import java.util.regex.Pattern;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 14:45 2018/7/18
 */
public class SortUtil {

    static InsertSort insertSort = new InsertSort();
    static QuickSort quickSort = new QuickSort();
    static MergeSort mergeSort = new MergeSort();
    static BucketSort bucketSort = new BucketSort();
    static RadixSort radixSort = new RadixSort();
    static HeapSort heapSort = new HeapSort();
    static ShellSort shellSort = new ShellSort();

    public void swap(Integer[] array, int i, int j) {
        Integer tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public int[] buildRandomScore(int min, int max, int size) {
        Random random = new Random();
        int[] rtn = new int[size];
        for (int i = 0; i < size; i++) {
            rtn[i] = random.nextInt(max - min) + 1;
        }
        return rtn;
    }

    /**
     * 判断一个字符串是否是数字。
     *
     * @param string
     * @return
     */
    public static boolean isNumber(String string) {
        if (string == null)
            return false;
        String reg = "^\\d+$";
        if ((Pattern.compile(reg).matcher(string)).find()){
            return true;
        }else{
            return false;
        }
    }
}
