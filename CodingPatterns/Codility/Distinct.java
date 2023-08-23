package Codility;

import java.util.HashSet;
import java.util.Set;

// https://app.codility.com/programmers/lessons/6-sorting/
public class Distinct {

    public static void main(String[] args) {

        int[] arr = {2, 1, 1, 2, 3, 1};

        System.out.println("Number of distinct values: " + distinct(arr));
    }
    
    private static int distinct(int[] arr) {

        if(arr.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        return set.size();
    }
}
