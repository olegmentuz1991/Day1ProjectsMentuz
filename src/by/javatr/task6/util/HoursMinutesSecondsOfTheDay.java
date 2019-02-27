package by.javatr.task6.util;

import java.util.ArrayList;

public class HoursMinutesSecondsOfTheDay {
    final static int SEC_IN_MIN = 60;
    final static int SEC_IN_HOUR = 3600;
    final static int FULL_DAY = 86400;
    public static int hours;
    public static int minutes;
    public static int seconds;
    public static int days;

    /**
     *
     * @param daySeconds
     * @return ArrayList<Integer>
     */
    public static ArrayList<Integer> timer(int daySeconds) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (daySeconds>FULL_DAY) {
            days = daySeconds / FULL_DAY;
            daySeconds = daySeconds - days*FULL_DAY;
        }
        hours = daySeconds / SEC_IN_HOUR;
        daySeconds = daySeconds - hours*SEC_IN_HOUR;
        minutes = daySeconds/SEC_IN_MIN;
        seconds = daySeconds%SEC_IN_MIN;
        list.add(hours);
        list.add(minutes);
        list.add(seconds);
        return list;
        }
}

