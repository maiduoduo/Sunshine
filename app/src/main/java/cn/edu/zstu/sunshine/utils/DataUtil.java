package cn.edu.zstu.sunshine.utils;

import java.util.Calendar;

/**
 * 日期、时间的工具类
 * Created by CooLoongWu on 2017-8-15 16:23.
 */

public class DataUtil {

    public static String week[] = {"周一", "周二", "周三", "周四", "周五", "周六", "周日"};
    private static final int FIRST_DAY = Calendar.SUNDAY;

    /**
     * 得到当前月份
     *
     * @return int
     */
    public static int getMonth() {
        return Calendar.getInstance().get(Calendar.MONTH) + 1;
    }

    /**
     * 得到今天是本周第几天（注：周一是第一天）
     *
     * @return int
     */
    public static int getDayOfWeek() {
        return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * 得到本周的日期
     *
     * @return int[]
     */
    public static int[] getDates() {
        int date[] = new int[7];
        Calendar calendar = Calendar.getInstance();
        while (calendar.get(Calendar.DAY_OF_WEEK) != FIRST_DAY) {
            calendar.add(Calendar.DATE, -1);
        }
        for (int i = 0; i < 7; i++) {
            calendar.add(Calendar.DATE, 1);
            date[i] = calendar.get(Calendar.DATE);
        }
        return date;
    }
}