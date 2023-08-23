package DPQuestions;

public class DominoArrangement {
    
    public static void main(String[] args) {
        
        int n1 = 3;
        int n2 = 5;

        System.out.println("Number of ways: " + numArrangement(n1));
        System.out.println("Number of ways: " + numArrangement(n2));
    }

    private static int numArrangement(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
