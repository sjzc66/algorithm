package com.sjzc.sort;

import java.util.Arrays;

/**
 * @author sjzc
 * @Description: 堆排序
 * @Date: Created in 14:40 2018/7/18
 */
public class HeapSort extends SortUtil {

    static class MyHeap {
        int[] arr = null;
        int heapSize = 0;
        int maxSize = 0;

        MyHeap(int size) {
            arr = new int[size];
            this.maxSize = size;
        }


        public void push(int value) {
            if (heapSize == maxSize) {
                throw new RuntimeException("heap is full");
            }
            arr[heapSize] = value;
            heapInsert(arr, heapSize++);
        }

        public int pop() {
            int res = arr[0];
            swap(arr, 0, --heapSize);
            heapify(arr, 0, heapSize);
            return res;
        }

        public void heapInsert(int[] heap, int index) {
            while (heap[(index - 1) / 2] < heap[index]) {
                swap(heap, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }

        public void heapify(int[] heap, int index, int heapSize) {
            int left = index * 2 + 1;
            while (left < heapSize) {
                // 这行，拿到了被删除的数，所以有问题
                // int largest = left + 1 < heapSize && heap[left] > heap[left + 1] ? left : left + 1;
                int largest = left + 1 < heapSize && heap[left + 1] > heap[left] ? left + 1 : left;
                if (arr[index] > arr[largest]) {
                    break;
                }
                swap(heap, index, largest);
                index = largest;
                left = index * 2 + 1;
            }
        }

        public void swap(int[] array, int i, int j) {
            Integer tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        public static void main(String[] args) {
            int[] arr = {7, 2, 5, 6, 1, 2, 9};
            MyHeap heap = new MyHeap(7);
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                heap.push(arr[i]);
            }
            System.out.println(Arrays.toString(heap.arr));
            int length = heap.heapSize;
            for (int i = 0; i < length; i++) {
                System.out.print(heap.pop() + "->");
            }
            System.out.println();
            System.out.println(Arrays.toString(heap.arr));
        }
    }
}
