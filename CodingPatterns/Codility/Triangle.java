package Codility;

import java.util.Arrays;

// https://app.codility.com/programmers/lessons/6-sorting/triangle/
public class Triangle {

    public static void main(String[] args) {
        
        int[] arr1 = {10, 2, 5, 1, 8, 20};
        int[] arr2 = {10, 50, 5, 1};

        System.out.println("Can triangle be build? " + triangle(arr1));
        System.out.println("Can triangle be build? " + triangle(arr2));
    }
    
    private static int triangle(int[] arr) {

        int n = arr.length;

        Arrays.sort(arr);
        for(int i = 2; i < n; i++) {
            if((arr[i - 2] + arr[i - 1]) > arr[i]) {
                return 1;
            }
        }
        return 0;
    }
}
