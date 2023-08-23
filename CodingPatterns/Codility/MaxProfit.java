package Codility;

// https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
public class MaxProfit {
    
    public static void main(String[] args) {

        int[] arr = {23171, 21011, 21123, 21366, 21013, 21367};

        System.out.println("Max profit is: " + maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {

        int n = arr.length;

        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            
            int curValue = arr[i];
            int potentialProfit = curValue - minValue;

            minValue = Math.min(minValue, curValue);
            maxProfit = Math.max(maxProfit, potentialProfit);
        }
        return maxProfit;

        // for(int price : arr) {
        //     minValue = Math.min(minValue, price);
        //     maxProfit = Math.max(maxProfit, price - minValue);
        // }
    }
}
