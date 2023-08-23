package DPQuestions;

public class CoinChange {
    
    public static void main(String[] args) {
        
        int[] coins = {5, 7, 8, 9};
        int sum = 49;

        System.out.println("Number of ways is: " + coinChange(coins, sum));

        int[] coins1 = {1, 2, 5};
        int sum1 = 7;

        System.out.println("Number of ways is: " + coinChange(coins1, sum1));
    }

    private static int coinChange(int[] coins, int sum) {

        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for(int coin : coins) {
            for(int i = coin; i <= sum; i++) {
                dp[i] = dp[i] + dp[i - coin];
            }
        }

        return dp[sum];
    }
}
