package DPQuestions;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    
    public static void main(String[] args) {
        
        int[] arr = {11, 23, 10, 37, 21, 50, 80};

        System.out.println("LIS is: " + longestSubsequence(arr));
    }

    private static int longestSubsequence(int[] arr) {
        
        int n = arr.length;
        int maxLength = 0;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {

                if(arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            if(maxLength < dp[i]) {
                maxLength = dp[i];
            }
        }
        return maxLength;
    }
}
