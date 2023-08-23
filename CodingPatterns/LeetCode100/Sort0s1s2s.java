package LeetCode100;

import java.util.Arrays;

public class Sort0s1s2s {
    
    public static void main(String[] args) {
        
        int[] arr = {0, 1, 2, 1, 2, 0, 0, 2, 2, 1, 1, 0};

        System.out.println("Sorted array: " + Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        int index = 0;

        while (left < right && index <= right) {

            if(arr[index] == 0) {
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;
                left++;
                index++;
            } else if(arr[index] == 2) {
                int temp = arr[index];
                arr[index] = arr[right];
                arr[right] = temp;
                right--;
                
            } else {
                index++;
            }
        }
        return arr;
    }
}
