package com.sjzc.javaTest.leetcode;

/**
 * @author zhaochong
 * @Description 扑克牌中的顺子
 * <p>
 * Solution0509
 * @create: 2020-04-26 20:13
 **/
public class Solution2006 {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int leftIndex = 0;
        int rightIndex = mountainArr.length() - 1;
        return find(target,mountainArr,leftIndex,rightIndex);
    }

    public int find(int target,MountainArray arr,int leftIndex,int rightIndex){
        int middleIndex = leftIndex + ((rightIndex-leftIndex)>>1);
        int leftValue = arr.get(leftIndex);
        int rightValue = arr.get(rightIndex);
        int middleValue = arr.get(middleIndex);
        if(target == leftValue){
            //刚好找到的中值就是结果
            return leftIndex;
        }
        if(target == middleValue){
            //刚好找到的中值就是结果
            return middleIndex;
        }
        if (leftIndex == rightIndex) {
            return -1;
        }
        if(target< leftValue && target < rightValue){
            //肯定找不到了
            return -1;
        }
        if(target > leftValue && target < rightValue){
            if(target < middleValue){
                //这种情况肯定是从左边找
                int l = leftIndex;
                int r = middleIndex;
                return find(target,arr,l,r);
            }else {
                //其他情况从右边找
                int l = middleIndex + 1;
                int r = rightIndex;
                return find(target,arr,l,r);
            }
        }
        if(target < leftValue && target > rightValue){
            if(target < middleValue){
                //其他情况从右边找
                int l = middleIndex + 1;
                int r = rightIndex;
                return find(target,arr,l,r);
            }else {
                //这种情况肯定是从左边找
                int l = leftIndex;
                int r = middleIndex;
                return find(target,arr,l,r);
            }
        }
        //没办法区分是左边还是右边，继续找两边
        int i = find(target,arr,leftIndex,middleIndex);
        if(i > -1){
            //左边找到，返回左边
            return i;
        }
        int j = find(target,arr,middleIndex+1,rightIndex);
        //左边找不到，返回右边
        return j;
    }

    public static void main(String[] args) {
        MountainArray array = new MountainArray();
        array.val = new int[7];
        array.val[0] = 1;
        array.val[1] = 2;
        array.val[2] = 3;
        array.val[3] = 4;
        array.val[4] = 5;
        array.val[5] = 3;
        array.val[6] = 1;

        Solution2006 solution2006 = new Solution2006();
        int inMountainArray = solution2006.findInMountainArray(2, array);
        System.out.println(inMountainArray);

    }

    static class MountainArray{
        int[] val;


        public int length() {
            return val.length;
        }

        public int get(int middleIndex) {
            return val[middleIndex];
        }
    }
}


