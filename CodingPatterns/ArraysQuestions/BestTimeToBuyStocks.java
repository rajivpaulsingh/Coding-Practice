package ArraysQuestions;

public class BestTimeToBuyStocks {
    
    public static void main(String[] args) {

        int[] arr = {10, 7, 5, 8, 11, 9};

        System.out.println("Maximum profit is: " + maxProfit(arr));
        System.out.println("Maximum profit is: " + maxProfit1(arr));
    }

    private static int maxProfit(int[] arr) {
        int n = arr.length;

        if(n == 0 || arr == null) {
            return 0;
        }

        int max_profit = 0;

        for(int i = 0; i < n-1; i++) {
            if(arr[i + 1] > arr[i]) {
                max_profit = max_profit + (arr[i + 1] - arr[i]);
            }
        }
        return max_profit;
    }

    private static int maxProfit1(int[] arr) {
        int n = arr.length;
        if(n == 0 || arr == null) {
            return -1;
        }

        int maxProfit = 0;
        int minPrice = arr[0];

        for(int i = 0; i < n; i++) {
            int potentialProfit = arr[i] - minPrice;

            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }
}
