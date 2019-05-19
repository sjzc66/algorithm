package com.sjzc.sort;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 10:29 2019/5/19
 */
public class BubboSort {

    public int[] sort(int[] arr) {
        int bubbo = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 10};
        BubboSort bs = new BubboSort();
        bs.print(arr);
        int[] sort = bs.sort(arr);
        bs.print(sort);
    }
}
