package com.sjzc.sort;
/**
 * @author sjzc
 * @Description: 桶排序
 * @Date: Created in 15:28 2018/7/18
 */
public class BucketSort extends SortUtil{

    public void execute(Integer[] array) {
        this.BucketSort(array, array.length, 10);
    }

    public void BucketSort(Integer[] array,int length,int max) {
        int index;
        Integer[] count = new Integer[max];     //计数器
        //计数器初始化;
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            index = array[i];
            count[index] += 1;
        }
        System.out.println("------------count的数据-------------");
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + ",");
        }
        //第一种方案，可以实现，但是数据来源不对
        /*int i = 0;          //要排的数据索引
        int k = 0;          //计数器的索引
        while (i < length) {      // 等待排序的数据第i个
            while (count[k] > 0) {
                array[i] = k;
                count[k] -= 1;
                i++;
            }
            k++;
        }*/
        //第二种方案，不改变原数据
        
    }


    public static void main(String[] args) {
        Integer[] array = new Integer[]{9,8,6,6,6,4,3,2,1,0,5,9,8,8,4,3,9,1,0};
        System.out.println("------------排序前-------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        SortUtil.bucketSort.execute(array);
        System.out.println();
        System.out.println("------------排序后-------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }
}
