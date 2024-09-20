package JimsPackage;
import java.util.*;


public class usefulMethods {
    static <T> boolean itemInCommon(T[] a, T[] b){
        HashMap<T,T> myMap = new HashMap<>();
        for(T i : a) {
            myMap.put(i, i);
        }

        for(T i : b) {
            T get = myMap.get(i);
            if (get != null) {
                return true;
            }
        }
        return false;
    }

    static int[] sumOfTwo(int[] x, int target){
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i =0; i<x.length; i++) {
            Integer y = myMap.get(x[i]);
            if (y != null) {
                return new int[]{y, i};
            }
            myMap.put(target - x[i], i);
        }
        return new int[] {0};
    }
}
