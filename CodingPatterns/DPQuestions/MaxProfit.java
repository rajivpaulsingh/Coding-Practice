package DPQuestions;

public class MaxProfit {

    public static void main(String[] args) {
        
        int[] arr = {8, 1, 2, 4, 6, 3};

        System.out.println("Max profit is: " + maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {

        int n = arr.length;

        int[] minUptil = new int[n];
        int[] maxProfit = new int[n];
        int max = Integer.MIN_VALUE;

        minUptil[0] = arr[0];

        // Fill the minUptil array
        for(int i = 1; i < n; i++) {
            minUptil[i] = Math.min(minUptil[i - 1], arr[i]);
        }

        // Fill the maxProfit arr
        for(int i = 0; i < n; i++) {
            maxProfit[i] = arr[i] - minUptil[i];

            if(max < maxProfit[i]) {
                max = maxProfit[i];
            }
        }
        return max;
    }
    
}
