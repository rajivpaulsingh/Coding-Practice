package Codility;

import java.util.HashSet;
import java.util.Set;

// https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
public class FrogRiverOne {
    
    public static void main(String[] args) { 

        int[] arr = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;

        System.out.println("The earliest time the frog can cross the river is:  " + frogRiver(arr, X));       
    }

    private static int frogRiver(int[] arr, int X) {

        int n = arr.length;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(arr[i]);

            if(set.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
