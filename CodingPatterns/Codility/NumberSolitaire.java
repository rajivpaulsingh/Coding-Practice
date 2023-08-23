package Codility;

// https://app.codility.com/programmers/lessons/17-dynamic_programming/number_solitaire/
public class NumberSolitaire {

    public static void main(String[] args) {
        
        int[] arr = {1, -2, 0, 9, -1, -2};

        System.out.println("Subset of maximal sum is: " + solitaire(arr));
    }

    private static int solitaire(int[] arr) {
        
        int n = arr.length;
        // main idea: using "dynamic programming" to build up the solution (bottom up)
        int[] dp = new int[n];
        dp[0] = arr[0];

        // build up from "dp[1], dp[2], ..., dp[A.length-1]"
        for(int i = 1; i < n; i++) {
            int max = Integer.MIN_VALUE;

            // a die could be "1 to 6" 
            for(int j = 1; j <= 6; j++) {
                
                if(i - j >= 0) {
                    max = Math.max(max, dp[i - j] + arr[i]); // very important: not "A[i-die]+A[i]", instead have to use "dp[i-die]+A[i]"
                }
            }

            dp[i] = max; // keep the best one as the dp value    
        }

        return dp[n - 1];
    }

}
