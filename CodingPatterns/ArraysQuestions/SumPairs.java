package ArraysQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumPairs {
    
    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 11, 9, 4, 7, 3, 8};
        int sum = 10;

        System.out.println("The sum pairs using brute-force: ");
        twoSum1(arr, sum);
        
        System.out.println("The sum pairs using hash-map: ");
        twoSum2(arr, sum);

        System.out.println("The sum pairs are at index: " + Arrays.toString(twoSum3(arr, sum)));
        
    }

    private static void twoSum1(int[] arr, int sum) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {

                if(arr[i] + arr[j] == sum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        
    }

    private static void twoSum2(int[] arr, int sum) {
        int n = arr.length;
        int count = 0;
        Map<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(!hmap.containsKey(arr[i])) {
                hmap.put(sum - arr[i], arr[i]);
            } else {
                System.out.println("(" + hmap.get(arr[i]) + ", " + arr[i] + ")");
                count++;
            }
        }
        System.out.println("Total pairs: " + count);
    }

    private static int[] twoSum3(int[] arr, int sum) {
        int n = arr.length;
        Map<Integer, Integer> hMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(!hMap.containsKey(sum - arr[i])) {
                hMap.put(arr[i], i);
            } else {
                return new int[] {hMap.get(sum - arr[i]), i};
            }
        }

        return new int[] {-1, -1};
    }
}
