package DPQuestions;

import java.util.Arrays;

public class SplitNumbers {
    
    public static void main(String[] args) {
        
        int num = 6;

        System.out.println("Maximum product of number splitting: " + maxProduct(num));

    }

    private static int maxProduct(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            for(int j = 1; j < (i - 1); j++) {
                dp[i] = Math.max(dp[i], Math.max(j, dp[j]) * Math.max(i - j, dp[i - j]));
            }
        }

        return dp[n];
    }
}
