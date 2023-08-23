package LeetCode100;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        
        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum profit is: " + maxProfit(arr));
    }
    
    private static int maxProfit(int[] arr) {

        int n = arr.length;
        int maxProfit = Integer.MIN_VALUE;
        int minValue = arr[0];

        for(int i = 1; i < n; i++) {
            int potentialProfit = arr[i] - minValue;

            minValue = Math.min(minValue, arr[i]);
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }
}
