package Codility;

import java.util.HashMap;
import java.util.Map;

// https://app.codility.com/programmers/lessons/8-leader/dominator/
public class Dominator {

    public static void main(String[] args) {
        
        int[] arr1 = {3, 4, 3, 2, 3, -1, 3, 3};

        System.out.println("The index of dominator is: " + dominator(arr1));
    }
    
    private static int dominator(int[] arr) {

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        // 1. Add all in hmap
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        // 2. Get the max number of counts
        int maxNum = arr[0];
        int maxCount = 0;
        for(int key : map.keySet()) {
            int curCount = map.get(key);
            if(curCount > maxCount) {
                maxCount = curCount;
                maxNum = key;
            }
        }

        // 3. Check if it is greater than half of length
        if(maxCount > n/2) {
            //maxCount is the dominator
        } else {
            return -1;
        }

        // 4. return any index of the dominator
        for(int i = 0; i < n; i++) {
            if(arr[i] == maxNum) {
                return i;
            }
        }

        return -1;
    }
}
