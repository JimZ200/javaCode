package JimsPackage;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = binarySearch(arr, 4);

        System.out.println(result);
    }
    static int binarySearch(int[] arr, int k) {
        int min = 0;
        int max = arr.length - 1;
        if (k > arr.length) return -1;
        while (min <= max) {
            int middle = min + (max - min) / 2;
            int value = arr[middle];

            if (value < k) {
                min = middle + 1;
            } else if (value > k) {
                max = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
