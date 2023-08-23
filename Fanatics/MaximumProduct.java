package Fanatics;

import java.util.Arrays;

public class MaximumProduct {

    public static void main(String[] args) {
        int[] nums = {10, -10, 20, 40, -20, -30};

        System.out.println("Maximum Product: " + findMaximumProduct(nums));
    }


    public static int findMaximumProduct(int[] nums) {
        int n = nums.length;

        // Sort the array in ascending order
        Arrays.sort(nums);

        // Case 1: All positive numbers or mix of positive and negative numbers
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: All negative numbers
        int product2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum product
        return Math.max(product1, product2);
    }
}
