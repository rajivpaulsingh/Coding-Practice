package LeetCode100;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    
    public static void main(String[] args) {
        
        String str = "abccccdd";

        System.out.println("Longest palindrome length is: " + longPalin(str));
    }

    private static int longPalin(String str) {

        Set<Character> set = new HashSet<>();
        int pairs = 0;

        for(char c : str.toCharArray()) {
            if(set.contains(c)) {
                pairs++;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        pairs = pairs * 2;
        if(!set.isEmpty()) {
            pairs++;
        }

        return pairs;
    }
}
