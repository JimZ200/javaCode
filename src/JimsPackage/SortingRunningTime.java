package JimsPackage;
import java.util.Scanner;
import java.util.Random;
public class SortingRunningTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        Sorting sort = new Sorting();
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i =0; i<a.length; i++) {
            a[i] = rand.nextInt(n) + 1;
            b[i] = a[i];
        }

        long start1, end1, res1, start2, end2, res2;
        start1 = System.currentTimeMillis();
        sort.selectionSort(a);
        end1 = System.currentTimeMillis();
        res1 = end1 - start1;

        start2 = System.currentTimeMillis();
        sort.mergeSort(b);
        end2 = System.currentTimeMillis();

        res2 = end2 - start2;

        System.out.println("Selection sort: " + res1);
        System.out.println("Merge sort: " + res2);

    }
}
