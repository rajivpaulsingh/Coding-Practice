package Codility;

import java.util.HashSet;
import java.util.Set;

// https://app.codility.com/programmers/lessons/15-caterpillar_method/count_distinct_slices/
// Count the number of distinct slices (containing only unique numbers).

public class CountDistinctSlices {
    
    public static void main(String[] args) {
        
        int[] arr = {3, 4, 5, 5, 2};

        System.out.println("Number of distinct slices are: " + distinctSlices(arr));
    }

    private static int distinctSlices(int[] A) {

        int N = A.length;
        int count = 0;
        int left = 0;
        int right = 0;

        Set<Integer> distinct = new HashSet<>();

        while (left < N && right < N) {
            
            if (!distinct.contains(A[right])) {
                distinct.add(A[right]);
                count += (right - left + 1);
                right++;
            } else {
                distinct.remove(A[left]);
                left++;
            }

            if (count > 1_000_000_000) {
                return 1_000_000_000;
            }
        }

        return count;
    }
}
