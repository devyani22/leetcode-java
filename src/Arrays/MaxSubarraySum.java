package Arrays;

public class MaxSubarraySum {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // Initialize the max sum to the first element
        int currentSum = nums[0];  // Initialize the current sum to the first element

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);  // Add current number to sum or start fresh
            maxSum = Math.max(maxSum, currentSum);  // Update max sum if current sum is larger
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum is: " + maxSubArray(nums));
    }
}

