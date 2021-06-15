package java.maqh.utils.date;

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
        LocalDate localDate = LocalDate.now();
        return localDate.getYear();
    }

    /**
     * 获取去年
     * @return {@link int}
     */
    public static int getLastYear() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear() - 1;
    }

    /**
     * 获取当前月
     *
     * @return 当前月
     */
    public static int getMonth() {
        LocalDate localDate = LocalDate.now();
        return localDate.getMonthValue();
    }

    /**
     * 获取当前天
     *
     * @return 当前天
     */
    public static int getDay() {
        LocalDate localDate = LocalDate.now();
        return localDate.getDayOfMonth();
    }

    /**
     * 获取当前月天数
     *
     * @return 当前月天数
     */
    public static int lastDay() {
        LocalDate localDate = LocalDate.now();
        LocalDate with = localDate.with(TemporalAdjusters.lastDayOfMonth());
        return with.getDayOfMonth();
    }

    /**
     * 获取项目年
     * @return {@link List< Integer>}
     */
    public static List<Integer> getYearList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 2020; i <= getYear(); i++) {
            list.add(i);
        }
        return list;
    }

    /**
     * 获取月度list
     * @return {@link List< String>}
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

    public static String getDate() {
        LocalDate localDate = LocalDate.now();
        return localDate.format(FMT);
    }

    public static String getDateFmt(Date date, String fmt) {
        DateFormat bf = new SimpleDateFormat(fmt);
        return bf.format(date);
    }

    public static Date getTime() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MINUTE, -5);
        return c.getTime();
    }
}
