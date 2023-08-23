package Codility;

import java.util.HashSet;
import java.util.Set;

// https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
public class PermCheck {

    public static void main(String[] args) {

        int[] arr1 = {4, 1, 3, 2};
        int[] arr2 = {4, 1, 3};

        // 1 = pass, 0 = fail
        System.out.println("Perm check passed? " + permCheck(arr1)); 
        System.out.println("Perm check passed? " + permCheck(arr2));
    }

    private static int permCheck(int[] arr) {

        int n = arr.length;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for(int i = 1; i <= n; i++) {
            if(!set.contains(i)) {
                return 0;
            }
        }
        return 1;
    }
    
}
