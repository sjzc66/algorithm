package com.sjzc.sort;

/**
 * @author sjzc
 * @Description: 桶排序
 * @Date: Created in 15:28 2018/7/18
 */
public class RadixSort extends SortUtil{

    public void execute(Integer[] array) {
        this.RadixSortLSD(array);
    }

    public void RadixSortLSD(Integer[] array) {         //低位优先
        int length = array.length;
        int index;
        Integer[] cpArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            cpArray[i] = array[i];
            array[i] = 0;
        }

        Integer[] count = new Integer[10];     //计数器
        //计数器初始化;
        for (int i = 0; i < count.length; i++) {        //计数器初始化
            count[i] = 0;
        }

        for (int position = 1; position <= 3; position++) {
            for (int i = 0; i < cpArray.length; i++) {
                index = cpArray[i];
                index = (int) (index % Math.pow(10, position));
                count[index] += 1;
            }
            System.out.println("------------count的数据-------------");
            for (int i = 0; i < count.length; i++) {
                System.out.print(count[i] + ",");
            }
            System.out.println();
            int i = 0;
            int k = 0;
            while (i < length) {      // 等待排序的数据第i个
                while (count[k] > 0) {
                    array[i] += k * (int)Math.pow(10, position - 1);
                    count[k] -= 1;
                    i++;
                }
                k++;
            }
            System.out.println("-----------第" + position + "次-排序后-------------");
            for (int o = 0; i < array.length; i++) {
                System.out.print(array[o] + ",");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Integer[] array = new Integer[]{354,526,111,761};
        System.out.println("------------排序前-------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        SortUtil.radixSort.execute(array);
        System.out.println();
        System.out.println("------------排序后-------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }
}
