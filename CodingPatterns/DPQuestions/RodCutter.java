package DPQuestions;

public class RodCutter {
    
    public static void main(String[] args) {
        
        int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20};
	    int len = 5;  

        System.out.println("Max vlaue earned: " + rodCutter(prices, len));
    }

    private static int rodCutter(int[] prices, int len) {

        int[] dp = new int[len + 1];
        dp[0] = 0;

        for(int i = 1; i <= len; i++) {

            int maxPrice = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                maxPrice = Math.max(maxPrice, prices[j] + dp[i - j]);
            }
            dp[i] = maxPrice;
        }
        return dp[len];
    }
}
