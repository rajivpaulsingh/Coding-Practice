package Codility;

import java.util.HashMap;
import java.util.Map;

// https://app.codility.com/programmers/lessons/8-leader/equi_leader/
public class EquiLeader {
    
    public static void main(String[] args) {

        int[] arr = {4, 3, 4, 4, 4, 2};

        System.out.println("The index of equileader is: " + equileader(arr));
    }

    private static int equileader(int[] arr) {

        int n = arr.length;
        if(n == 0) return 0;

        // The key point: 
        // Only the "leader of the whole array" can have an "equi leader", Assume a value Y is "not" the leader of the whole array.
        // Can value Y have an equi leader? The answer is NO.
        
        // Based on this condition, to solve this problem, 
        // 1. we first find the leader of the whole array. 
        // 2. after finding a leader (if any), 

        // 1. Find the leader
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        int maxNum = arr[0];
        int maxCount = 0;
        for(int key : map.keySet()) {
            int curCount = map.get(key);
            if(curCount > maxCount) {
                maxCount = curCount;
                maxNum = key;
            }
        }

        if(maxCount > n/2) {
            //maxCount is the dominator
        } else {
            return -1;
        }

        int leader = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == maxNum) {
                leader = arr[i];
            }
        }

        // 2. Scan the array again
        int equiLeaders = 0;
        int leftLeaderCount = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == leader) {
                leftLeaderCount++;
            }

            // if the leader is "a leader of left side" (more than half)
            if(leftLeaderCount > (0.5) * (i + 1)) {
                //then check the right side
                int righLeaderCount = maxCount - leftLeaderCount;

                // if the leader is "a leader in right side" (more than half)
                if(righLeaderCount > (0.5) * (n - i - 1)) {
                    equiLeaders++;
                }
            }
        }
        return equiLeaders;
    }
}
