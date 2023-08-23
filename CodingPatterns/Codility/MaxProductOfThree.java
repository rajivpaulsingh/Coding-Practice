package Codility;

import java.util.Arrays;

// https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
public class MaxProductOfThree {

    public static void main(String[] args) {
        
        int[] arr = {-3, 1, 2, -2, 5, 6};

        System.out.println("The max product of three is: " + maxProduct(arr));
    }
    
    private static int maxProduct(int[] arr) {

        int n = arr.length;
        
        // Sort the array
        Arrays.sort(arr);

        // max1 = 1st biggest * 2nd biggest * 3rd biggest (all +ve)
        int max1 = arr[n - 1] * arr[n - 2] * arr[n - 3]; 

        // max2 = 1st smallest * 2nd smallest * 1st biggest (2 -ve and 1 +ve)
        int max2 = arr[0] * arr[1] * arr[n - 1];

        int res = Math.max(max1, max2);

        return res;
    }
}
