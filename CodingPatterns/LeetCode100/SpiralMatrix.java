package LeetCode100;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("The spiral matrix is: " + spiral(matrix));
    }

    private static List<Integer> spiral(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = matrix.length - 1;
        int top = 0;
        int bottom = matrix[0].length - 1;

        while(top <= bottom && left <= right) {

            for(int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            for(int i = right; i>= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }

        return list;
    }
    
}
