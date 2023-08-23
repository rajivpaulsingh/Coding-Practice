package Codility;

import java.util.Arrays;

// https://app.codility.com/programmers/lessons/15-caterpillar_method/min_abs_sum_of_two/
// Find the minimal absolute value of a sum of two elements.

public class MinAbsSumOfTwo {
    
    public static void main(String[] args) {

        int[] arr = {1, 4, -3};
        
        System.out.println("The min absolute sum of two is: " + minSum(arr));
    }

    private static int minSum(int[] arr) {

        Arrays.sort(arr);

        int minAbsSum = Math.abs(arr[0] + arr[1]);
        
        for (int i = 0; i < arr.length - 1; i++) {
            int currentSum = arr[i] + arr[i + 1];
            minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
        }
        
        return minAbsSum;

        // Arrays.sort(arr);
        //
        // int left = 0;
        // int right = arr.length - 1;
        // int minAbsSum = Math.abs(arr[left] + arr[right]);

        // while (left <= right) {
        //     int currentSum = arr[left] + arr[right];
        //     minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));

        //     if (currentSum <= 0) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }

        // return minAbsSum;
    }
}
