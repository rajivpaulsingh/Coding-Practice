package LeetCode100;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    
    public static void main(String[] args) {
        
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println("Number of jewels in stones are: " + numJewels(jewels, stones));
    }

    private static int numJewels(String jewels, String stones) {
        
        Set<Character> set = new HashSet<>();

        for(char c : jewels.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        for(char c : stones.toCharArray()) {
            if(set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
