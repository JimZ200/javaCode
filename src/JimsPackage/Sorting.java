package JimsPackage;

import java.util.Arrays;

class Sorting{

     void bubbleSort(int[] a){
        for(int i=0; i<a.length; i++) {
            for(int j = i+1; j<a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    void insertionSort(int[] a){
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
     void selectionSort(int[] arr){
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

        private int[] mergeSortHelper(int[] a, int[] b){
            int[] newArray = new int[a.length + b.length];
            int j = 0;
            int i =0;
            int k = 0;
            while(i < a.length && j < b.length) {
             if(a[i] < b[j]) {
                newArray[k] = a[i];
                i++;
                k++;
            } else {
                newArray[k] = b[j];
                j++;
                k++;
            }
        }

        while(i< a.length) {
            newArray[k] = a[i];
            k++;
            i++;
        }

        while(j < b.length) {
            newArray[k] = b[j];
            k++;
            j++;
        }

        return newArray;
    }

     int[] mergeSort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,arr.length/2));
        int[] right = mergeSort(Arrays.copyOfRange(arr, arr.length/2, arr.length));

        return mergeSortHelper(left, right);
    }

}