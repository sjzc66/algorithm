package com.sjzc.javaTest.leetcode;
//实现一个 MyCalendar 类来存放你的日程安排。如果要添加的日程安排不会造成 重复预订 ，则可以存储这个新的日程安排。
//
// 当两个日程安排有一些时间上的交叉时（例如两个日程安排都在同一时间内），就会产生 重复预订 。
//
// 日程可以用一对整数 start 和 end 表示，这里的时间是半开区间，即 [start, end), 实数 x 的范围为， start <= x <
//end 。
//
// 实现 MyCalendar 类：
//
//
// MyCalendar() 初始化日历对象。
// boolean book(int start, int end) 如果可以将日程安排成功添加到日历中而不会导致重复预订，返回 true 。否则，返回
//false 并且不要将该日程安排添加到日历中。
//
//
//
//
// 示例：
//
//
//输入：
//["MyCalendar", "book", "book", "book"]
//[[], [10, 20], [15, 25], [20, 30]]
//输出：
//[null, true, false, true]
//
//解释：
//MyCalendar myCalendar = new MyCalendar();
//myCalendar.book(10, 20); // return True
//myCalendar.book(15, 25); // return False ，这个日程安排不能添加到日历中，因为时间 15 已经被另一个日程安排预订了
//。
//myCalendar.book(20, 30); // return True ，这个日程安排可以添加到日历中，因为第一个日程安排预订的每个时间都小于 20
// ，且不包含时间 20 。
//
//
//
// 提示：
//
//
// 0 <= start < end <= 10⁹
// 每个测试用例，调用 book 方法的次数最多不超过 1000 次。
//
// Related Topics 设计 线段树 二分查找 有序集合 👍 186 👎 0

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochong
 *
 **/
public class Solution0729 {

    List<Section> sectionList;

    static class Section{
        int start;
        int end;

        public Section(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean hasCoincide(Section b) {
            if (this.start <= b.start && b.start < this.end) {
                return true;
            }
            if (this.start < b.end && b.end < this.end) {
                return true;
            }
            if (this.start >= b.start && this.end <= b.end) {
                return true;
            }
            return false;
        }

        public boolean hasCoincide2(Section b) {
            if (this.end <= b.start) {
                return false;
            }
            if (this.start >= b.end) {
                return false;
            }
            return true;
        }
    }


    // MyCalendar
    public Solution0729() {
        sectionList = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        Section target = new Section(start, end);
        boolean ans = true;
        for (Section sec : sectionList) {
            if (sec.hasCoincide(target)) {
                ans = false;
                break;
            }
        }
        if (ans) {
            sectionList.add(target);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution0729 solution0729 = new Solution0729();
        //[10, 20], [15, 25], [20, 30]
        // System.out.println(myCalendar.book(10, 20));
        // System.out.println(myCalendar.book(15, 25));
        // System.out.println(myCalendar.book(20, 30));


        //["MyCalendar","book","book","book","book","book","book","book","book","book","book"]
        //[[],[47,50],[33,41],[39,45],[33,42],[25,32],[26,35],[19,25],[3,8],[8,13],[18,27]]
        // System.out.println(myCalendar.book(47,50));
        // System.out.println(myCalendar.book(33,41));
        // System.out.println(myCalendar.book(39,45));
        // System.out.println(myCalendar.book(33,42));
        // System.out.println(myCalendar.book(25,32));
        // System.out.println(myCalendar.book(26,35));
        // System.out.println(myCalendar.book(19,25));
        // System.out.println(myCalendar.book(3,8));
        // System.out.println(myCalendar.book(8,13));
        // System.out.println(myCalendar.book(18,27));

        // [null,true,true,false,true,true,false,true,true,true,false]
        // [null,true,true,false,false,true,false,true,true,true,false]

        // ["MyCalendar","book","book","book","book","book"]
        // [[],[37,50],[33,50],[4,17],[35,48],[8,25]]
        System.out.println(solution0729.book(37,50));
        System.out.println(solution0729.book(33,50));
        System.out.println(solution0729.book(4,17));
        System.out.println(solution0729.book(35,48));
        System.out.println(solution0729.book(8,25));
        // [null,true,true,true,false,false]
        // [null,true,false,true,false,false]

    }
}


