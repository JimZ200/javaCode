package JimsPackage;
import java.util.*;
public class CodingPractice {
    int longestSequence(int[] arr){
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : arr) {
            set.add(i);
        }
        for(int num : arr) {
            if (!set.contains(num - 1)) {
                int currentStreak = 1;
                int curr = num;
                while (set.contains(curr + 1)) {
                    currentStreak++;
                    curr++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
    boolean uniqueCharacter(String string){
        Set<Character> set = new HashSet<>();
        for(int i =0; i<string.length(); i++) {
            Character curr = string.charAt(i);
            if (set.contains(curr)) {
                return false;
            }
            set.add(curr);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        CodingPractice cp = new CodingPractice();
        System.out.println("Longest is: " + cp.longestSequence(arr));

        String string = "ABCA";
        System.out.println(cp.uniqueCharacter(string));
    }
}
