package com.maqh.utils.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 日期工具类
 * </p>
 * @author maqh
 * @since 2020-07-21
 */
public class DateTool {
    private DateTool() {}

    private static  final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * 获取当前年
     *
     * @return 当前年
     */
    public static int getYear() {
        return getLocalDate().getYear();
    }

    /**
     * 获取当前时间日期对象
     * @return 当前时间
     */
    public static LocalDate getLocalDate(){
        return LocalDate.now();
    }

    /**
     * 获取去年
     * @return 去年
     */
    public static int getLastYear() {
        return getLocalDate().getYear() - 1;
    }

    /**
     * 获取当前月
     *
     * @return 当前月
     */
    public static int getMonth() {
        return getLocalDate().getMonthValue();
    }

    /**
     * 获取当前天
     *
     * @return 当前天
     */
    public static int getDay() {
        return getLocalDate().getDayOfMonth();
    }

    /**
     * 获取当前月天数
     *
     * @return 当前月天数
     */
    public static int lastDay() {
        LocalDate with = getLocalDate().with(TemporalAdjusters.lastDayOfMonth());
        return with.getDayOfMonth();
    }

    /**
     * 获取月度list
     * @return 12个月的集合
     */
    public static List<String> getMonthList(){
        List<String> list = new ArrayList<>();
        list.add("1月");
        list.add("2月");
        list.add("3月");
        list.add("4月");
        list.add("5月");
        list.add("6月");
        list.add("7月");
        list.add("8月");
        list.add("9月");
        list.add("10月");
        list.add("11月");
        list.add("12月");
        return list;
    }

    /**
     * 获取当前日期的格式化后的时间
     * @return yyyy-MM-dd
     */
    public static String getDate() {
        return getLocalDate().format(FMT);
    }

    /**
     *
     * @param date 日期对象
     * @param fmt  格式化字符串
     * @return 格式化后的时间
     */
    public static String getDateFmt(Date date, String fmt) {
        DateFormat bf = new SimpleDateFormat(fmt);
        return bf.format(date);
    }

    /**
     * 获取当前时间的前5分钟
     * @return 当前时间前5分钟
     */
    public static Date getTime() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MINUTE, -5);
        return c.getTime();
    }
}
