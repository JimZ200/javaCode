package JimsPackage;
import java.util.*;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 6;
        int[] result = twoSum(arr, target);

        System.out.println(Arrays.toString(result));
        System.out.println(maxSubArray(arr));

        int[] array = {1,2,3};
        System.out.println("Count element: " + countElement(array));

        int[] a = {1,2,3};
        int[] b = {5,4,6};

        System.out.println(itemInCommon(a,b));
    }
    static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer idx = map.get(arr[i]);
            if (idx != null) {
                return new int[] {idx, i};
            }
            map.put(target - arr[i], i);
        }
        return new int[] {0};
    }
    static int maxSubArray(int[] arr){
        int curr = arr[0];
        int max = arr[0];
        for (int i = 1 ; i < arr.length; i++) {
            curr = Math.max(curr, arr[i] + arr[i-1]);
            max = Math.max(max, curr);
        }
        return max;
    }
    static int countElement(int[] arr){
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for(int i : arr) {
            set.add(i);
        }

        for(int i : arr) {
            if (set.contains(i + 1)) {
                count++;
            }
        }
        return count;
    }
    static boolean itemInCommon(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();

        for(int i : a) {
            set.add(i);
        }

        for(int i : b) {
            return set.contains(i);
        }
        return false;
    }
}
