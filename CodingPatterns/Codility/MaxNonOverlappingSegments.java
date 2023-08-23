package Codility;

// https://app.codility.com/programmers/lessons/16-greedy_algorithms/max_nonoverlapping_segments/
// Find a maximal set of non-overlapping segments.

public class MaxNonOverlappingSegments {
    
    public static void main(String[] args) {

        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};

        System.out.println("The max non overlapping segments are: " + nonOverlap(A, B));
    }

    private static int nonOverlap(int[] A, int[] B) {

        int N = A.length;
        if (N == 0) {
            return 0;
        }

        int count = 1; // At least one segment can be selected
        int prevEnd = B[0];

        for (int i = 1; i < N; i++) {
            
            if (A[i] > prevEnd) {
                count++;
                prevEnd = B[i];
            }
        }

        return count;
    }
}
