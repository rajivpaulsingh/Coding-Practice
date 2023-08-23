package LeetCode100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println("The indexes are: " + Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] arr, int target) {

        if(arr == null) return null;
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(target - arr[i], i);
            } else {
                return new int[] {map.get(arr[i]), i};
            }
        }
        return null;
    }
}
