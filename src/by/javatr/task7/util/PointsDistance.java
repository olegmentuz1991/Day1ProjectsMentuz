package by.javatr.task7.util;

import by.javatr.scanner.EnterTheNumber;

class Point {

    public static int x1 = EnterTheNumber.enterInt();
    public static int x2 = EnterTheNumber.enterInt();
    public static int y1 = EnterTheNumber.enterInt();
    public static int y2 = EnterTheNumber.enterInt();
    public static double pointDistance(){
        double distanceX = x1 - x2;
        double distanceY = y1 - y2;
        double distance = Math.sqrt(Math.pow(distanceX,2) + Math.pow(distanceY,2));

        return distance;
    }
}
