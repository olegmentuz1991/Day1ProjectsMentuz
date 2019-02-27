package by.javatr.task7.util;


public class PointsDistance {
    /**
     *
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     * @return double
     */
    public static double pointDistance(int x1, int x2, int y1, int y2) {
        double distanceX = x1 - y1;
        double distanceY = x2 - y2;
        double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));

        return distance;
    }
}
