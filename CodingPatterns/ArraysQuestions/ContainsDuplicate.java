package ArraysQuestions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 8, 9, 2, 6};

        System.out.println("Does this array contains duplicates? " + isDuplicate(arr));
    }

    private static boolean isDuplicate(int[] arr) {

        int n = arr.length;
        if(n == 0 || arr == null) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                return true;
            }
        }
        return false;
    }
    
}
