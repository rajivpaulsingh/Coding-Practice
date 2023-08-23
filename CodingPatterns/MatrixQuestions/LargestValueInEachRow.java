package MatrixQuestions;

import java.util.ArrayList;
import java.util.List;

public class LargestValueInEachRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> largestValues = findLargestValues(matrix);
        System.out.println("Largest values in each row: " + largestValues);
    }

    private static List<Integer> findLargestValues(int[][] matrix) {
        List<Integer> largestValues = new ArrayList<>();

        for (int[] row : matrix) {
            int max = Integer.MIN_VALUE; // Initialize the max value with the smallest possible integer

            for (int num : row) {
                max = Math.max(max, num); // Update the max value if a larger number is found
            }

            largestValues.add(max); // Add the max value of the row to the list
        }

        return largestValues;
    }
}
