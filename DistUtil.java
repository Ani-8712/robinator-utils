// package utils;

public class DistUtil {

    /**
     * returns the distance between 2 points represented by
     * double arrays with 2 values each
     * @param start
     * a double array representing starting position
     * @param end
     * a double array representing endimg position
     * @return
     * the double distance between the 2 points
     */
    public static double calcDist(double[] start, double[] end){
        return Math.hypot(
            end[0] - start[0] , 
            end[1] - start[1]);
    }

    /**
     * returns the speed from start and end points, seperated by 1 minute
     * @param start
     * starting point
     * @param end
     * ending point
     * @return
     * speed over the last minute 
     */
    public static double    calcSpeed(double[] start, double[] end){
        return calcDist(start, end) * 60;
    }

    /**
     * returns the speed from the distance over the past minute
     * @param distance
     * distance traveled over the past minute
     * @return
     * average speed over the past minute
     */
    public static double calcSpeed(double distance){
        return distance * 60;
    }

}