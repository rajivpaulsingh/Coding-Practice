package LeetCode100;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        String str1 = "XVI";
        String str2 = "MCMXCVI";

        System.out.println("Integer value is: " + romToInt(str1));
        System.out.println("Integer value is: " + romToInt(str2));
    }

    private static int romToInt(String str) {

        int n = str.length();

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // int res = map.get(str.charAt(n - 1));
        int res = 0;

        for(int i = n - 2; i >= 0; i--) {
            
           int cur = map.get(str.charAt(i));
           int prev = map.get(str.charAt(i + 1));

           if(cur >= prev) {
            res = res + cur;
           } else {
            res = res - cur;
           }
        }

        // Add last value
        res = res + map.get(str.charAt(n - 1));

        return res;
    }
    
}
