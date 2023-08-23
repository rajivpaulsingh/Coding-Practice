package LeetCode100;

import java.util.Arrays;

public class ContainsDuplicate {
    
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        System.out.println("Does it contains duplicate? " + hasDuplicate(arr));
    }

    private static boolean hasDuplicate(int[] arr) {

        // Sort the array, if the adjuscent numbers are same return true;
        int n = arr.length;
        Arrays.sort(arr);
        
        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
