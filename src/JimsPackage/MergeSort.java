package JimsPackage;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,3,9,4};

        int[] result = mergeSort(arr);

        System.out.println("Merge Sort: " + Arrays.toString(result));

        int fibOf3 = fib(5);
        System.out.println(fibOf3);
    }
    static int[] merge(int[] a, int[] b) {
        int[] newArr = new int[a.length + b.length];
        int idx = 0;
        int i =0;
        int j = 0;

        while(i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                newArr[idx] = a[i];
                idx++;
                i++;
            } else if (b[j] < a[i]) {
                newArr[idx] = b[j];
                idx++;
                j++;
            }
        }

        if(i > j) {
            while (j < b.length) {
                newArr[idx] = b[j];
                idx++;
                j++;
            }
        } else if(j > i) {
            while (i < a.length) {
                newArr[idx] = a[i];
                idx++;
                i++;
            }
        }
        return newArr;
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static Integer[] fibArray = new Integer[100];

    static Integer fib(int n) {
        if (fibArray[n] != null) {
            return fibArray[n];
        }
        if (n == 0 || n == 1) {
            return n;
        }
        fibArray[n] = fib(n - 1) + fib(n - 2);
        return fibArray[n];
    }
}
