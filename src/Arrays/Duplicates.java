package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    Duplicates() {}

    /** Brute force O(n^2) **/
    public boolean containsDuplicateBrute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate of " + nums[i] + " found at position "+ j);
                    return true;
                }
            }
        }
        throw new IllegalArgumentException("No duplicates found");
    }

    /** Sort the array - **/
    public boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                System.out.println("Duplicate of " + nums[i] + " found");
                return true;
            }
        }
        return false;
    }

    /** Optimized solution using a set O(n)
     */
    public boolean containsDuplicateSet(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num: nums) {
            if (seen.contains(num)) {       // no need to check for !seen.isEmpty() - redundant, does not add to the goal
                System.out.println("Duplicate of " + num + " found");
                return true;
            }
            seen.add(num);
        }
    return false;
    }

    public static void main(String[] args) {
        Duplicates duplicates = new Duplicates();
        int[] nums = {11, 1, 2, 3, 100, 2};
        //int[] nums = {11, 1, 2, 3, 100};   // throws error
        duplicates.containsDuplicateSort(nums);
    }
}
