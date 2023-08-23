package Codility;

import java.util.Arrays;

// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
public class CyclicRotation {

    public static void main(String[] args) {
        
        int[] arr = {3, 8, 9, 7, 6};
        int k = 3;

        System.out.println("The rotated array is: " + Arrays.toString(rotate(arr, k)));

        int[] arr1 = {3, 8, 9, 7, 6};
        int k1 = 3;

        System.out.println("The rotated array is: " + Arrays.toString(rotate1(arr1, k1)));
    }

    private static int[] rotate(int[] arr, int k) {

        int n = arr.length;
        int[] rotatedArr = new int[n];

        for(int i = 0; i < n; i++) {
            int index = (i + k) % n;
            rotatedArr[index] = arr[i];
        }

        return rotatedArr;
    }

    private static int[] rotate1(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        return arr;
    }

    private static void reverse(int[] arr, int left, int right) {

        while(left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
