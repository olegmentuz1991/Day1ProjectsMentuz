package by.javatr.task6.util;

import by.javatr.scanner.EnterTheNumber;

public class HoursMinutesSecondsOfTheDay {
    public static int daySeconds;
    final static int SEC_IN_MIN = 60;
    final static int SEC_IN_HOUR = 3600;
    final static int SEC_IN_DAY = 86400;
    public static int hours;
    public static int minutes;
    public static int seconds;
    public static void everyDayTimer(){
        System.out.println("Введите количество секунд");
       daySeconds = EnterTheNumber.enterInt();
       hours = daySeconds/SEC_IN_HOUR;
       minutes = daySeconds/SEC_IN_MIN - (hours*SEC_IN_MIN);
       seconds = daySeconds%SEC_IN_MIN;
        System.out.println(hours+" Часов "+minutes+" Минут "+ seconds + " Секунд");
    }
}
