package LeetCode100;

import java.util.Arrays;

public class TwoSumII {
    
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println("The indexes are: " + Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] arr, int target) {

        int[] res = new int[2];

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }
}
