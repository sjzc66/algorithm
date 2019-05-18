package com.sjzc.sort;

/**
 * @author sjzc
 * @Description: 1962年的快速排序
 * @Date: Created in 14:40 2018/7/18
 */
public class QuickSort extends SortUtil{
    public void quickSort(Integer[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            quickSort(list, low, middle - 1);
            quickSort(list, middle, high);
        }
    }

    public int getMiddle(Integer[] list, int low, int high) {
        int tmp = list[low];
        while (low < high) {
            while (low < high && list[high] > tmp) {
                high--;
            }
            list[low] = list[high];
            while (low < high && list[low] < tmp) {
                low++;
            }
            list[high] = list[low];
        }
        list[low] = tmp;
        return tmp;
    }

    public void quick(Integer[] list) {
        quickSort(list, 0, list.length);
    }

    public void quickSort_1(int[] data, int start, int end) {
        if (data == null || start < 0 || end > data.length - 1) {
            throw new IllegalArgumentException("Invalid Parameters");
        }
        if (start == end) return;
        int index = partition(data, start, end);
        if (index > start) {
            quickSort_1(data, start, index - 1);
        }
        if (index < end) {
            quickSort_1(data, index + 1, end);
        }
    }

    private int partition(int[] data, int start, int end) {
        int index = start + (int)(Math.random() * (end - start + 1));
        swap(data, index, end);
        int small = start - 1;
        for (index = start; index < end; index++) {
            if (data[index] < data[end]) {
                small++;
                if (small != index) {
                    swap(data, index, small);
                }
            }
        }
        swap(data, small + 1, end);
        return small + 1;
    }

    private void swap(int[] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void quickSort_2(int[] data, int start, int end) {
        if (data == null || start >= end) return;
        int i = start, j = end;
        int pivotKey = data[start];
        while (i < j) {
            while (i < j && data[j] >= pivotKey) j--;
            if (i < j) data[i++] = data[j];
            while (i < j && data[i] <= pivotKey) i++;
            if (i < j) data[j--] = data[i];
        }
        data[i] = pivotKey;
        quickSort_2(data, start, i - 1);
        quickSort_2(data, i + 1, end);
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 51, 24,1,22};
        QuickSort qs = new QuickSort();
        qs.quickSort_1(list, 0, list.length - 1);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
