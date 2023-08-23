package Codility;

// https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/
public class MaxSliceSum {
    
    public static void main(String[] args) {
        
        int[] arr = {3, 2, -6, 4, 0};

        System.out.println("The max sum of a slice is: " + maxSum(arr));
    }

    private static int maxSum(int[] arr) {

        int maxSum = arr[0];
        int currentSum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
