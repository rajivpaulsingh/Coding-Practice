package Codility;

import java.util.HashSet;
import java.util.Set;

// https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
public class MissingInteger {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 3, 6, 4, 1, 2};
        int[] arr2 = {1, 2, 3};

        System.out.println("The smallest integer missing is: " + missingInt(arr1));
        System.out.println("The smallest integer missing is: " + missingInt(arr2));
    }
    
    private static int missingInt(int[] arr) {

        int n = arr.length;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for(int i = 1; i <= n; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return n + 1;
    }
}
