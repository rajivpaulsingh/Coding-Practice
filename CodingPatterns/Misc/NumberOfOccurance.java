package Misc;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurance {

    public static void main(String[] args) {
		
		String str = "This is awesomeee";
		int n = str.length();
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);

            if(!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        System.out.println(map);

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("The character " + entry.getKey() + " occurred " + entry.getValue() + " times");
        }

    }
    
}
