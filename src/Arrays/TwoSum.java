package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

    /**
     * Intuitive, brute force way with two loops O(n^2)
     * @param nums
     * @param target
     * @return array of 2 integers
     */
    public static int[] twoSumTwoLoops(int[] nums, int target) {
        // Iterate over each pair of elements in the array
        for (int i = 0; i < nums.length; i++) {
            // Start from i + 1 to avoid comparing with itself and to ensure each pair is only considered once.
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the two elements equals the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };  // Return the indices of the elements
                }
            }
        }
        // Throw an exception if no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumOptimized(int[] nums, int target) {

        Map<Integer, Integer> indexMap = new HashMap<>();

        for(int i = 0; i< nums.length; i++) {
           int complement = target - nums[i];

           if (indexMap.containsKey(complement)) {
               return new int[] { indexMap.get(complement), i };
           }
           indexMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] sumArr = twoSumTwoLoops(nums, target);
        System.out.println(Arrays.toString(sumArr));

        int[] twoSumOpt = twoSumOptimized(nums, target);
        System.out.println(Arrays.toString(twoSumOpt));
    }
}
