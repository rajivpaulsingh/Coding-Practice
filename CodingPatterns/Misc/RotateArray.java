package Misc;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
		
		int arr1[][] = {
				{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                };
		System.out.println("Rotated array is:" + Arrays.deepToString(rotate(arr1, 3)));
		
		int arr2[][] = {
				{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
                };
		System.out.println("Rotated array is:" + Arrays.deepToString(rotate(arr2, 4)));
		System.out.println("Rotated array is:" + Arrays.deepToString(rotate1(arr2, 4)));

	}

    private static int[][] rotate(int[][] arr, int n) {

        int res[][] = new int[n][n];

        // After rotating i = j, j = n - i - 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                res[j][n - i - 1] = arr[i][j];
            }   
        }

        return res;
    }

    private static int[][] rotate1(int arr[][], int n) {
		
		for (int i = 0; i < n; i++) {
	        for (int j = i; j < n-i-1; j++) {

				int temp = arr[i][j];
				arr[i][j] = arr[n-j-1][i];
				arr[n-j-1][i] = arr[n-i-1][n-j-1];
				arr[n-i-1][n-j-1] = arr[j][n-i-1];
				arr[j][n-i-1] = temp;
			}
		}
		
		return arr;
	}
    
}
