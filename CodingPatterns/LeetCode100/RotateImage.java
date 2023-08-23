package LeetCode100;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3, 4},
            {9, 8, 5, 6},
            {6, 5, 3, 7},
            {9, 2, 6, 8}
        };

        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Rotated matrix is: ");
        System.out.println(Arrays.deepToString(rotate(matrix)));
    }
    
    private static int[][] rotate(int[][] matrix) {

        int n = matrix.length;

        // 1. Transpose the matrix
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 2. Swap the rows
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        return matrix;
    }
}
