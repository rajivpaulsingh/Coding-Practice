package LeetCode100;

import java.util.Arrays;

public class TransposeMatrix {
    
    public static void main(String[] args) {
        
        int[][] matrix = {
            {2, 4, -1},
            {-10, 5, 11},
            {10, -7, 6}
        };

        System.out.println("The transposed matrix is: " + Arrays.deepToString(transpose(matrix)));
        System.out.println("The transposed matrix is: " + Arrays.deepToString(transpose1(matrix)));
    }

    private static int[][] transpose(int[][] matrix) {

        int[][] res = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                res[i][j] = matrix[j][i];
            }
        }

        return res;
    }

    private static int[][] transpose1(int[][] matrix) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }
}
