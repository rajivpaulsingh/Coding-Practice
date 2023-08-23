package Misc;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentOccuringItem {
    
    public static void main(String[] args) {
		
		int arr[] = {1, 3, 1, 3, 2, 1};
		
		System.out.println("The max occurred item is: " + maxOccurred(arr));
	}

    private static int maxOccurred(int[] arr) {

        int n = arr.length;
        int count = 0;
        int max = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }

            if(map.get(arr[i]) > count) {
                count = map.get(arr[i]);
                max = arr[i];
            }
        }
        return max;

    }
}
