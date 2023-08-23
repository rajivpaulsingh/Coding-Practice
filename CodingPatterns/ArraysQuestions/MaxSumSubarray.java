package ArraysQuestions;

public class MaxSumSubarray {

    public static void main(String[] args) {
        
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("The max sum of subarray is: " + maxSubarray(arr));
    }

    private static int maxSubarray(int[] arr) {

        int n = arr.length;
        if(n == 0 || arr == null) {
            return -1;
        }

        int maxSum = arr[0];
        int curSum = arr[0];
        for(int i = 0; i < n; i++) {
            
            curSum = Math.max(curSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
    
}
