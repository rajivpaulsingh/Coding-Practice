package Codility;

// https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_double_slice_sum/
public class MaxDoubleSliceSum {

    public static void main(String[] args) {
        
        int[] arr = {3, 2, 6, -1, 4, 5, -1, 2};

        System.out.println("The max double slide sum is: " + maxDoubleSlice(arr));
    }

    private static int maxDoubleSlice(int[] A) {

        // (X, Y, Z)
        // 1st slice: A[X+1] + ... + A[Y-1] 
        // 2nd slice: A[Y+1] + ... + A[Z-1]
        // Key Point: The array will be split at "Y" 
        
        // main idea: if the middle point is "Y", find "maxLeft" and "maxRight"
        int N = A.length;
        
        int[] maxEndingHere = new int[N];
        int[] maxStartingHere = new int[N];
        
        // 1) find "maxLeft"
        // maxLeft[i] is the maximum sum "contiguous subsequence" ending at index i 
        // note: because it is "contiguous", we only need the ending index (important)
        for (int i = 1; i < N - 1; i++) {
            maxEndingHere[i] = Math.max(maxEndingHere[i - 1] + A[i], 0);
        }
        
        // 2) find "maxRight"
        // maxRight[i] is the maximum sum "contiguous subsequence" starting at index i 
        // note: because it is "contiguous", we only need the starting index (important)
        for (int i = N - 2; i > 0; i--) {
            maxStartingHere[i] = Math.max(maxStartingHere[i + 1] + A[i], 0);
        }
        
        // 3) find the maximum of "maxLeft + maxRight"
        int maxDoubleSliceSum = 0;
        for (int i = 1; i < N - 1; i++) {
            maxDoubleSliceSum = Math.max(maxDoubleSliceSum, maxEndingHere[i - 1] + maxStartingHere[i + 1]);
        }
        
        return maxDoubleSliceSum;
    }
    
}
