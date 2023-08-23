package DPQuestions;

public class OnTheWayHome {

    public static void main(String[] args) {
        
        int m = 4;
        int n = 3; // 4x3 grid

        System.out.println("Unique ways to reach home: " + numWays(m, n));
    }

    private static int numWays(int m, int n) {

        int[][] dp = new int[m][n];
        
        for(int i = 0; i <= m - 1; i++) {
            dp[i][n - 1] = 1;
        }

        for(int j = 0; j <= n - 1; j++) {
            dp[m - 1][j] = 1;
        }

        for(int i = m - 2; i >= 0; i--) {
            for(int j = n - 2; j >= 0; j--) {
                dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
            }
        }
        return dp[0][0];
    }
    
}
