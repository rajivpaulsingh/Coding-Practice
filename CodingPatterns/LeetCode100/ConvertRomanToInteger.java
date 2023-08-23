package LeetCode100;

import java.util.HashMap;

public class ConvertRomanToInteger {

    public static void main(String[] args) {

        String roman1 = "XXIV";
        String roman2 = "MCMXCVI";

        System.out.println("Integer number: " + romanToInt(roman1));
        System.out.println("Integer number: " + romanToInt(roman2));
    }

    private static int romanToInt(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        int prev = 0;

        for(int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            int cur = map.get(c);

            if(cur >= prev) {
                res = res + cur;
            } else {
                res = res - cur;
            }

            prev = cur;
        }
        return res;
    }   
}
