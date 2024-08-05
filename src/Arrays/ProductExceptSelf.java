package Arrays;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelfBruteForce(int[] nums) {

        int numsLength = nums.length;
        int[] productArr = new int[numsLength];

        for (int i = 0; i < numsLength; i++) {
            int product = 1;           // can't set to 0 as the product will always be zero
            for (int j = 0; j < numsLength; j++) {
                if (j == i) {          //if it is the same number, skip
                    continue;
                } else {
                    product *= nums[j];
                }
                productArr[i] = product;
            }
        }
        return productArr;
    }

    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] productArr = new int[numsLength];

        // calculate prefix of products
        int prefix = 1;
        for (int i = 0; i < numsLength; i++) {
            productArr[i] = prefix;
            prefix *= nums[i];
        }

        // calculate suffix of products
        int suffix = 1;
        for (int j = numsLength-1; j>=0; j--) {
            productArr[j] *= suffix;
            suffix *= nums[j];
        }

        return productArr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
