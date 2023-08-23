package DPQuestions;

public class HouseRobber {
    
    public static void main(String[] args) {
        
        int[] houses = {3, 8, 10, 4, 1, 7, 2};

	    System.out.println(robHouses(houses));
    }

    private static int robHouses(int[] arr) {

        int n = arr.length;
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return arr[0];
        } else if(n == 2) {
            return Math.max(arr[0], arr[1]);
        }

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
    }
}
