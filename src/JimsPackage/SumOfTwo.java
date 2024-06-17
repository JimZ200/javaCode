package JimsPackage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class SumOfTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 6;
        int[] result = twoSum(arr, target);

        System.out.println(Arrays.toString(result));
        System.out.println(maxSubArray(arr));
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
}
