package LeetCode100;

import java.util.Arrays;

public class SortArrayByParityII {
    
    public static void main(String[] args) {
        
        int[] arr = {3, 1, 2, 4};

        System.out.println("Parity sorted array is: " + Arrays.toString(paritySort(arr)));
    }

    private static int[] paritySort(int[] arr) {

        int even = 0;
        int odd = 1;

        while(even < arr.length && odd < arr.length) {

            while(even < arr.length && arr[even] % 2 == 0) {
                even += 2;
            }
            while(odd < arr.length && arr[odd] % 2 == 1) {
                odd += 2;
            }

            if(even < arr.length && odd < arr.length) {
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;

                even += 2;
                odd += 2;
            }
        }

        return arr;
    }
}
