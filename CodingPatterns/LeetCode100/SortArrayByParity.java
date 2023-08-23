package LeetCode100;

import java.util.Arrays;

public class SortArrayByParity {
    
    public static void main(String[] args) {
        
        int[] arr = {3, 1, 2, 4};

        System.out.println("Parity sorted array is: " + Arrays.toString(paritySort(arr)));
        System.out.println("Parity sorted array is: " + Arrays.toString(paritySort1(arr)));
    }

    private static int[] paritySort(int[] arr) {

        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        return arr;
    }

    private static int[] paritySort1(int[] arr) {

        int[] res = new int[arr.length];

        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                res[j] = arr[i];
                j++;
            }

            if(arr[i] % 2 == 1) {
                res[j] = arr[i];
                j++;
            }
        }
        
        return res;
    }
}
