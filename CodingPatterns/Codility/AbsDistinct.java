package Codility;

import java.util.HashSet;
import java.util.Set;

// https://app.codility.com/programmers/lessons/15-caterpillar_method/abs_distinct/
// Compute number of distinct absolute values of sorted array elements.

public class AbsDistinct {
    
    public static void main(String[] args) {

        int[] arr = {-5, -3, -1, 0, 3, 6};

        System.out.println("Number of distinct absolute values are: " + distinctValues(arr));
    }

    private static int distinctValues(int[] arr) {

        int n = arr.length;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
        
            // if(!set.contains(Math.abs(arr[i]))) {
            //     set.add(Math.abs(arr[i]));
            // }

            set.add(Math.abs(arr[i]));
        }
        System.out.println(set);

        return set.size();
    }
}
