package com.sjzc.javaTest.utils;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 9:15 2019/3/16
 */
public class Jdk8DateTimeTest {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date : " + today);

        System.out.println(today.getDayOfWeek());

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayWeek);
    }

    //public static void main(String[] args) {
    //    Date tmpDate = new Date();
    //    Date date = DateUtils.firstDayOfWeek(tmpDate);
    //    System.out.println("tmpDate:" + tmpDate + "|| date:" + date);
    //    tmpDate = DateUtils.plusDays(tmpDate, -2L);
    //    date = DateUtils.firstDayOfWeek(tmpDate);
    //    System.out.println("tmpDate:" + tmpDate + "|| date:" + date);
    //}

    //public static void main(String[] args) {
    //    Date tmpDate = new Date();
    //    Date date = DateUtils.nextDayOfWeek(tmpDate, 2L);
    //    System.out.println("tmpDate:" + tmpDate + "|| date:" + date);
    //    tmpDate = DateUtils.plusDays(tmpDate, -2L);
    //    date = DateUtils.nextDayOfWeek(tmpDate, 2L);
    //    System.out.println("tmpDate:" + tmpDate + "|| date:" + date);
    //}
}
