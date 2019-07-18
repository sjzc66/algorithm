package com.sjzc.javaTest.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;

/**
 * @author zhaochong
 * @Description
 * @create: 2019-07-18 11:13
 **/
public class WorkDayUtils {

    /**
     * 工作日map，true为补休，false为放假
     */
    private static final Map<Integer, Boolean> MAP = new HashMap();
    private static final List WORK_LIST = Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY);
    private static final List HOLIDAY_LIST = Arrays.asList(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);

    static {
        init();
    }

    private static void init() {
        // ---------------2017------------------
        MAP.put(20170102, false);
        MAP.put(20170122, true);
        MAP.put(20170127, false);
        MAP.put(20170130, false);
        MAP.put(20170131, false);
        MAP.put(20170201, false);
        MAP.put(20170202, false);
        MAP.put(20170204, true);
        MAP.put(20170401, true);
        MAP.put(20170403, false);
        MAP.put(20170404, false);
        MAP.put(20170501, false);
        MAP.put(20170527, true);
        MAP.put(20170529, false);
        MAP.put(20170530, false);
        MAP.put(20170930, true);
        MAP.put(20171002, false);
        // ------------------2018----------------
        MAP.put(20180101, false);
        MAP.put(20180211, true);
        MAP.put(20180215, false);
        MAP.put(20180216, false);
        MAP.put(20180219, false);
        MAP.put(20180220, false);
        MAP.put(20180221, false);
        MAP.put(20180224, true);
        MAP.put(20180405, false);
        MAP.put(20180406, false);
        MAP.put(20180408, true);
        MAP.put(20180428, true);
        MAP.put(20180430, false);
        MAP.put(20180501, false);
        MAP.put(20180618, false);
        MAP.put(20180924, false);
        MAP.put(20180929, true);
        MAP.put(20180930, true);
        MAP.put(20181001, false);
        MAP.put(20181002, false);
        MAP.put(20181003, false);
        MAP.put(20181004, false);
        MAP.put(20181005, false);
        // ------------------2019----------------
        MAP.put(20181229, false);
        MAP.put(20190101, false);
        MAP.put(20190202, true);
        MAP.put(20190203, true);
        MAP.put(20190204, false);
        MAP.put(20190205, false);
        MAP.put(20190206, false);
        MAP.put(20190207, false);
        MAP.put(20190208, false);
        MAP.put(20190405, false);
        MAP.put(20190428, true);
        MAP.put(20190501, false);
        MAP.put(20190502, false);
        MAP.put(20190503, false);
        MAP.put(20190505, true);
        MAP.put(20190607, false);
        MAP.put(20190913, false);
        MAP.put(20190929, true);
        MAP.put(20191001, false);
        MAP.put(20191002, false);
        MAP.put(20191003, false);
        MAP.put(20191004, false);
        MAP.put(20191007, false);
        MAP.put(20191012, true);
    }

    public static Date plusDays(Date date, Long addDays) {
        return toDate(toLocalDateTime(date).plusDays(addDays));
    }

    public static final String dateFormat(Date date, String format) {
        return toLocalDateTime(date).format(DateTimeFormatter.ofPattern(format));
    }

    public static final LocalDate toLocalDate(Date date) {
        return LocalDate.now(Clock.fixed(date.toInstant(), ZoneId.systemDefault()));
    }

    public static final LocalDateTime toLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    public static final Date toDate(TemporalAccessor temporal) {
        if (temporal instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) temporal;
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        if (temporal instanceof LocalDate) {
            LocalDate localDate = (LocalDate) temporal;
            return Date.from(localDate.atTime(0, 0).atZone(ZoneId.systemDefault()).toInstant());

        }
        if (temporal instanceof LocalTime) {
            LocalTime localTime = (LocalTime) temporal;
            return Date.from(LocalDateTime.of(LocalDate.now(), localTime).atZone(ZoneId.systemDefault()).toInstant());

        }
        return Date.from(Instant.from(temporal));
    }

    /**
     * 指定日期是否为工作日
     *
     * @param date
     * @return
     */
    public static boolean isWorkDay(Date date) {
        DayOfWeek dayOfWeek = toLocalDate(date).getDayOfWeek();
        Integer dateInt = Integer.parseInt(WorkDayUtils.dateFormat(date, "yyyyMMdd"));
        if (MAP.containsKey(dateInt)) {
            return MAP.get(dateInt);
        } else {
            if (WORK_LIST.contains(dayOfWeek)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static Date nextWorkDay(Date date) {
        date = WorkDayUtils.plusDays(date, 1L);
        if (isWorkDay(date)) {
            return date;
        } else {
            return nextWorkDay(date);
        }
    }

    public static Date nextWorkDay(Date date,int n) {
        for (int i = 0; i < n; i++) {
            date = nextWorkDay(date);
        }
        return date;
    }

    public static void main(String[] args) {
        Date date = new Date(Date.parse("9/10/2019"));
        for (int i = 0; i < 20; i++) {
            date = WorkDayUtils.nextWorkDay(date);
            String dateStr = WorkDayUtils.dateFormat(date, "yyyy-MM-dd");
            System.out.println(dateStr + ":" + dateStr);
        }

        //Date date = new Date(Date.parse("5/1/2019"));
        //for (int i = 0; i < 10; i++) {
        //    String dateStr = WorkDayUtils.dateFormat(date, "yyyy-MM-dd");
        //    boolean workDay = WorkDayUtils.isWorkDay(date);
        //    System.out.println(dateStr + ":" + workDay);
        //    date = WorkDayUtils.plusDays(date,1L);
        //    System.out.println();
        //}
    }

}
