package LeetCode100;

import java.util.Arrays;

public class ArrayPartition {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 3, 2};

        System.out.println("Max array pair sum: " + arrayPairSum(arr));
    }

    private static int arrayPairSum(int[] arr) {

        Arrays.sort(arr);
        int sum = 0;

        for(int i = 1; i < arr.length; i += 2) {
            sum = sum + Math.min(arr[i], arr[i - 1]);
        }

        return sum;
    }
}
