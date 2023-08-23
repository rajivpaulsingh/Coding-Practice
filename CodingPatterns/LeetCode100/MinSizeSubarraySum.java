package LeetCode100;

public class MinSizeSubarraySum {

    public static void main(String[] args) {
        
        int[] arr = {2, 3, 1, 2, 4, 3};
        int total = 7;

        System.out.println("Min size of subarray sum is: " + minSubArrayLen(arr, total));
    }
    
    private static int minSubArrayLen(int[] arr, int total) {

        if(arr == null || arr.length == 0) return 0;

        int len = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            while(sum >= total) {
                len = Math.min(len, i - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        if(len == Integer.MAX_VALUE) return 0;
        return len;
    }
}
