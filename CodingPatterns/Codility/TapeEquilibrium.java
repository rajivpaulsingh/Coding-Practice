package Codility;

// https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
public class TapeEquilibrium {
    
    public static void main(String[] args) {
        
        int[] arr = {3, 1, 2, 4, 3};

        System.out.println("Minimum difference is: " + minDiff(arr));
    }

    private static int minDiff(int[] arr) {

        int n = arr.length;
        int totalSum = 0;

        for(int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int minDiff = Integer.MAX_VALUE;
        int leftSum = 0;

        for(int i = 0; i < n - 1; i++) {
            leftSum += arr[i];

            int rightSum = totalSum - leftSum;

            int diff = Math.abs(leftSum - rightSum);

            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
