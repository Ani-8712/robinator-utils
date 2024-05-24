// package utils;


public class RandUtil{
    /**
     * returns a random number between min and max
     * @param min 
     * the min number, inclusive
     * @param max
     * the max number, exclusive
     * @return
     * a random number between min and max
     */
    public static int randBtwn(int min, int max){
        return (int)(Math.random()*max) + min;
    }

    /**
     * returns a random number between min and max
     * @param min 
     * the min number, inclusive
     * @param max
     * the max number, inclusive
     * @return
     * a random number between min and max
     */
    public static int randInclusive(int min, int max){
        return (int)(Math.random()*(max+1)) + min;
    }

    /**
     * returns a random number between min and max
     * @param min 
     * the min number, exclusive
     * @param max
     * the max number, exclusive
     * @return
     * a random number between min and max
     */
    public static int randExclusive(int min, int max){
        return (int)(Math.random()*max) + (min-1);
    }
}