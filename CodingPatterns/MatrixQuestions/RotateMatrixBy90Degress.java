package MatrixQuestions;

import java.util.Arrays;

/*
 * Given an N X N integer matrix, rotate it bye 90 degrees in place.In-place means minimal extra memory to be used, i.e. don’t make a new array to copy into). Rotate clockwise means top-row becomes right-column, right column becomes bottom-row etc.
eg.

[1, 2, 3, 4]                    [9, 6, 9, 1]
[9, 8, 5, 6]         –>         [2, 5, 8, 2]
[6, 5, 3, 7]                    [6, 3, 5, 3]
[9, 2, 6, 8]                    [8, 7, 6, 4]

Solution:
The idea is to do a “four-way” swap variable, we need to move the values from top -> right, right -> bottom, bottom -> left and left -> top, can we do it by using only one extra variable? Yes, we can.

At each layer we are gonna loop through the elements and swap them as follows:
1.- Save the ith element in the top array in a temporary variable (in our example the top array is [1 2 3 4] ).
2.- Move the ith element from left to top.
3.- Move the ith element from bottom to left.
4.- Move the ith element from right to bottom.
5.- Save 
*/

public class RotateMatrixBy90Degress {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {9, 8, 5, 6},
            {6, 5, 3, 7},
            {9, 2, 6, 8}
        };

        int[][] matrix1 = {
            {1, 2, 3, 4},
            {9, 8, 5, 6},
            {6, 5, 3, 7},
            {9, 2, 6, 8}
        };

        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Rotated matrix is: ");
        System.out.println(Arrays.deepToString(rotate(matrix)));

        System.out.println("Rotated matrix in a single pass: ");
        System.out.println(Arrays.deepToString(rotateMatrix(matrix1)));
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

        // 2 Swap the rows (for clockwise)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        return matrix;
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
    
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }

        return matrix;
    }
    
}
