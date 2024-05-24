// package utils;

public class ArrUtil{

    public static String retArr(double[] array){
        String str = "[";
        for(int i = 0; i < array.length; i++){
            if(i < array.length-1){
                str += array[i] + ",";
            }else{
                str += array[i];
            }
        }
        
        str += "]";
        return str;
    }

    public static String retArr(Object[] array){
        String str = "[";
        for(int i = 0; i < array.length; i++){
            if(i < array.length-1){
                str += array[i] + ",";
            }else{
                str += array[i];
            }
        }

        str += "]";
       
        return str;
    }

    public static void PrintArr(Object[] array){
        System.out.println(retArr(array));
    }


    public static double[] toDoubleArr(int[] array){
        double[] toReturn = new double[array.length];
        for(int i = 0; i < array.length; i++){
            toReturn[i] = array[i] * 1.0;
        }
        return toReturn;
    }

    public static Object[] toObjArr(double[] array){
        Object[] balls = new Object[array.length];
        for(int i = 0; i < array.length; i++){
            balls[i] = (Object)(array[i]);
        }

        return balls;
    }

    public static Object[] toObjArr(int[] array){
        return toObjArr(toDoubleArr(array));
    }

    public static Object[] toObjArr(boolean[] array){
        Object[] balls = new Object[array.length];
        for(int i = 0; i < array.length; i++){
            balls[i] = (Object)(array[i]);
        }

        return balls;
    }

    public static void main(String[] args) {
        PrintArr(toObjArr(toDoubleArr(new int[]{1,2,3,4,45,6,4,3})));
    }

}

