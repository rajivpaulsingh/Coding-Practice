package MatrixQuestions;

/**
  * 3. Search a 2D Matrix: Given an m x n matrix with integers in ascending order, 
  determine whether a target integer is in the matrix.
  */

public class SearchMatrix {
    
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 16;

        System.out.println("Found target? " + searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while(left <= right) {
            int mid = left + (right-left)/2;
            int midX = mid / n;
            int midY = mid % n;

            if(matrix[midX][midY] == target) {
                return true;
            } else if (matrix[midX][midY] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
