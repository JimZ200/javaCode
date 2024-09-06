package JimsPackage;

import java.util.Arrays;

class Sorting{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.gc();
    }
    static void insertionSort(int[] a){
        for(int i = 1; i<a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j+1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
    static void selectionSort(int[] arr){
        for(int i =0; i<arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

}