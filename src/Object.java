import java.util.*;
public class Object {
    /**
     * method to take in an array, a list to find and a list to replace with
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int[] findAndReplace(int[] a, int[] b, int[] c) {
        int[] newArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[i];

        }
        //loop through the find array and the original array and compare them
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[i]) {
                    newArr[i] = c[i];
                }

            }
        }
        return newArr;
    }

    public static int wordCount(String x){
        int counter =0;
        String[] words = x.split("\\s+");
        counter = words.length;
        return counter;

    }
    public static void main(String[] args) {


    }
}