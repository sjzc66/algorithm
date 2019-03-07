package com.sjzc.sort;

/**
 * @author sjzc
 * @Description: 归并排序
 * @Date: Created in 15:30 2018/7/18
 */
public class MergeSort extends SortUtil {

    public void execute(Integer[] array) {
        Integer[] targetArray = new Integer[array.length + 1];
        this.mergeSort(array, targetArray, 0, array.length - 1);
    }

    public void mergeSort(Integer[] array, Integer[] tempArray, int left, int right) {
        int middle = selectMiddele(left, right);
        if (left < right) {
            this.mergeSort(array, tempArray, left, middle);
            this.mergeSort(array, tempArray, middle + 1, right);
        }
        this.merge(array, tempArray, left, right, middle);
    }

    public void mergeSort2(Integer[] array, Integer[] tempArray, int left, int right) {
        // TODO: 2018/7/21 优化的归并排序
    }


    public int selectMiddele(int start, int end) {
        return (start + end) / 2;
    }

    public void merge(Integer[] array, Integer[] tempArray, int left, int right, int middle) {
        int index1 = left;
        int index2 = middle + 1;
        int k = left;
        for (int l = left; l <= right; l++) {
            tempArray[l] = array[l];
        }
        while (index1 <= middle && index2 <= right) {
            if (tempArray[index1] <= tempArray[index2]) {
                array[k] = tempArray[index1];
                index1++;
            } else if (tempArray[index1] > tempArray[index2]) {
                array[k] = tempArray[index2];
                index2++;
            }
            k++;
        }
        while (index1 <= middle) {
            array[k] = tempArray[index1];
            index1++;
            k++;
        }
        while (index2 <= right) {
            array[k] = tempArray[index2];
            index2++;
            k++;
        }
    }
}
