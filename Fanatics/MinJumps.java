package Fanatics;

import java.util.Arrays;

public class MinJumps {
    
    public static void main(String[] args) {
        
        int[] nums = {2, 3, 1, 1, 4};

        System.out.println("Minimum jumps required: " + minJumps(nums));
    }

    private static int minJumps(int[] arr) {

        int n = arr.length;
        
        int[] dp = new int[n];
        Arrays.fill(arr, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {

                if(j + arr[j] >= i) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[n-1];
    }
}
