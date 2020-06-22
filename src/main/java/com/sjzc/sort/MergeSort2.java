package com.sjzc.sort;

import java.util.Arrays;

/**
 * @author sjzc
 * @Description: 归并排序
 * @Date: Created in 15:30 2018/7/18
 */
public class MergeSort2 extends SortUtil {

    public void execute(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        this.mergeSort(arr, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 1);
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public void merge(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int p1 = l;
        int p2 = m + 1;
        int index = 0;
        while (p1 <= m && p2 <= r) {
            help[index++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m) {
            help[index++] = arr[p1++];
        }
        while (p2 <= r) {
            help[index++] = arr[p2++];
        }
        for (int i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 4};
        System.out.println(Arrays.toString(nums));
        MergeSort2 solution = new MergeSort2();
        solution.execute(nums);
        System.out.println(Arrays.toString(nums));
    }
}
