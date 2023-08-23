package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsInTwoArray {

    public static void main(String[] args) {

        int arrA[] = {1, 2, 9, 10, 11, 12};
        int arrB[] = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};

        System.out.println("The common elements are: " + Arrays.toString(commonElements(arrA, arrB)));
    }

    private static Integer[] commonElements(int arr1[], int arr2[]) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++) {
            if(!set.contains(arr1[i])) {
                set.add(arr1[i]);
            }
        }

        for(int j = 0; j < arr2.length; j++) {
            if(set.contains(arr2[j])) {
                list.add(arr2[j]);
            } 
        }
        Integer res[] = new Integer[list.size()];
        return list.toArray(res);
    }
    
}
