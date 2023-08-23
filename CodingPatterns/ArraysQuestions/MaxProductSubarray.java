package ArraysQuestions;

import java.util.Arrays;

public class MaxProductSubarray {

    public static void main(String[] args) {
        
        int arr[] = {2, 3, -2, 4};

        System.out.println("The maximum product subarray is: " + maxProduct(arr));
        System.out.println("The maximum product subarray is: " + findMaximumProduct(arr));
    }

    private static int maxProduct(int[] arr) {

        int n = arr.length;
        if(n == 0 || arr == null) {
            return -1;
        }

        int max = arr[0];
        int min = arr[0];
        int res = arr[0];
        
        for(int i = 0; i < n; i++) {

            int tempMax = Math.max(arr[i] * max, arr[i] * min);
            int tempMin = Math.min(arr[i] * max, arr[i] * min);

            max = Math.max(max, tempMax);
            min = Math.min(min, tempMin);

            res = Math.max(res, max);
        }
        return res;
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
